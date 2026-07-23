package com.cognizant.ormlearn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
@SpringBootApplication

public class OrmLearnApplication {

    @Autowired
    CountryService service;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Bean
    CommandLineRunner run() {

        return args -> {




            Country c = new Country("Xy", "newCountry");
            service.addCountry(c);
            System.out.println("Country added succcessfully"+c);

            
        };
    }
}