package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estates") // localhost:8080/estates
public class EstateController {

    @Autowired
    EstateRepository estateRepository;

    // INDEX
    // GET request on localhost:8080/estates
    public ResponseEntity<List<Estate>> getAllEstates(){
        return new ResponseEntity<>(estateRepository.findAll(), HttpStatus.OK);
    }

}
