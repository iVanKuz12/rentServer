package ru.kuznecov.ivan.service;

import ru.kuznecov.ivan.entity.City;
import ru.kuznecov.ivan.pojo.CityPojo;

import java.util.List;

public interface CityService {
    List<City> getAll();

    List<CityPojo> getAllPojo();

    void save(City city);
}
