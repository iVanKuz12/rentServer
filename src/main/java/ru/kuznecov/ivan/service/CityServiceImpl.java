package ru.kuznecov.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuznecov.ivan.entity.City;
import ru.kuznecov.ivan.pojo.CityPojo;
import ru.kuznecov.ivan.repository.CityRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<CityPojo> getAllPojo() {
        List<City> cityList= cityRepository.findAll();
        List<CityPojo> cityPojoList = new ArrayList<>();
        for (City city: cityList){
            String name = city.getName();
            CityPojo cityPojo = new CityPojo();
            cityPojo.setName(name);
            cityPojoList.add(cityPojo);
        }
        return cityPojoList;
    }

    @Override
    public void save(City city) {
        cityRepository.saveAndFlush(city);
    }
}

