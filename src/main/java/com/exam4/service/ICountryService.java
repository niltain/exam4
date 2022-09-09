package com.exam4.service;


import com.exam4.model.Country;

import java.util.List;
import java.util.Optional;

public interface ICountryService {

    List<Country> findAllCountries();

    Optional<Country> findById(Long id);
}

