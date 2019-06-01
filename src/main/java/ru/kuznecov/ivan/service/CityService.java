package ru.kuznecov.ivan.service;

import ru.kuznecov.ivan.entity.City;

import java.util.List;

public interface CityService {
    List<City> getAll();

    void save(City city);
}
