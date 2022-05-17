package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("estates") // localhost:8080/estates
public class EstateController {

    @Autowired
    EstateRepository estateRepository;

    // INDEX
    // GET request on localhost:8080/estates

    @GetMapping
    public List<Estate> getAllEstates(){
        return estateRepository.findAll();
    }

    // SHOW
    @GetMapping(value = "/{id}")// localhost:8080/estates/1
    public ResponseEntity<Optional<Estate>> getEstateById(@PathVariable Long id){
        return new ResponseEntity<>(estateRepository.findById(id), HttpStatus.OK);
    }



}
