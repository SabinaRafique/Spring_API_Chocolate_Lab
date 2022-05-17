package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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

    // SHOW
    @GetMapping(value = "/{id}") //localhost:8080/chocolates/1
    public ResponseEntity<Optional<Chocolate>> getChocolateById (@PathVariable Long id){
        return new ResponseEntity<>(chocolateRepository.findById(id), HttpStatus.OK);
    }

}
