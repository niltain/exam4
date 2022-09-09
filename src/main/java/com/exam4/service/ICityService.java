package com.exam4.service;

import com.exam4.model.City;

import java.util.List;
import java.util.Optional;

public interface ICityService {
    List<City> FindAllCities();

    Optional<City> findById(Long id);

    City save(City city);

    void remove(Long id);
}
