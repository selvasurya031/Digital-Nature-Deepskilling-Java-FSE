package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public Country getCountry(String code) {
        return repository.findById(code).orElse(null);
    }

    @Override
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    @Override
    public List<Country> searchCountry(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}
