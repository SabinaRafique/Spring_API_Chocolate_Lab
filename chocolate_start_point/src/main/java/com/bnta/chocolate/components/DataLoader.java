package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate estate1 = new Estate("Tobago Estate", "Tobago");
        estateRepository.save(estate1);

        Estate estate2 = new Estate("The Rabot Estate", "St Lucia");
        estateRepository.save(estate2);

        Chocolate chocolate1 = new Chocolate("White Chocolate", 20, estate1);
        chocolateRepository.save(chocolate1);

        Chocolate chocolate2 = new Chocolate("Milk Chocolate", 25, estate1);
        chocolateRepository.save(chocolate2);

        Chocolate chocolate3 = new Chocolate("Dark Chocolate", 90, estate2);
        chocolateRepository.save(chocolate3);
    }
}
