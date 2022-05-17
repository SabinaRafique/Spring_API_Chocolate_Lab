package com.bnta.chocolate.controller;

import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estates") // localhost:8080/estates
public class EstateController {

    @Autowired
    EstateRepository estateRepository;



}
