package com.cognizant.ormlearn.service;

import java.util.List;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

import jakarta.transaction.Transactional;

public interface CountryService {

    Country getCountry(String code);

    Country addCountry(Country country);

    Country updateCountry(Country country);
    
    @Transactional
    Country findCountryByCode(String countryCode)
            throws CountryNotFoundException;

    void deleteCountry(String code);

    List<Country> searchCountry(String name);

}