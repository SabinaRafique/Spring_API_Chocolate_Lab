package com.bnta.chocolate.controller;

import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("chocolates") // localhost:8080/chocolates
public class ChocolateController {

    @Autowired
    ChocolateRepository chocolateRepository;

}
