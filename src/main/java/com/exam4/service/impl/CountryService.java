package com.exam4.service.impl;


import com.exam4.model.Country;
import com.exam4.repository.ICountryRepository;
import com.exam4.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private ICountryRepository iCountryRepository;

    @Override
    public List<Country> findAllCountries() {
        return iCountryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return iCountryRepository.findById(id);
    }
}
