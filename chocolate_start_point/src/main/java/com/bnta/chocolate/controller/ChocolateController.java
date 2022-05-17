package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("chocolates") // localhost:8080/chocolates
public class ChocolateController {

    @Autowired
    ChocolateRepository chocolateRepository;

    // INDEX
    // GET request on localhost:8080/chocolates
    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocolatesAndFilters(
            @RequestParam(required = false, name = "cocoaPercentage") Integer cocoaPercentage
    ) {
        if (cocoaPercentage != null) {
            return new ResponseEntity<>(
                    chocolateRepository.findChocolateByCocoaPercentageGreaterThan(cocoaPercentage), HttpStatus.OK);
        }
        return new ResponseEntity<>(chocolateRepository.findAll(), HttpStatus.OK);

    }

}
