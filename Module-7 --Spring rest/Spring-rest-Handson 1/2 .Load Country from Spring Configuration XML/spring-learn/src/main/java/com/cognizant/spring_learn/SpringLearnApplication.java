package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
    	System.out.println("hi");
        displayCountry();

    }

    public static void displayCountry() {

        System.out.println("Inside displayCountry()");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        System.out.println("Context Loaded");

        Country country = context.getBean("country", Country.class);

        System.out.println("Bean Retrieved");

        System.out.println(country);
    }
}
