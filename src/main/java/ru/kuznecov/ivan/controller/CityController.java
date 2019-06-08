package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kuznecov.ivan.entity.City;
import ru.kuznecov.ivan.pojo.CityPojo;
import ru.kuznecov.ivan.service.CityService;
import java.util.List;

@RestController
@RequestMapping(value = "/city")
public class CityController {
    private static final String OK = "OK";
    private static final String ERROR = "ERROR";

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<City> getCity(){
        return cityService.getAll();
    }
    @RequestMapping(value = "/getAllPojo", method = RequestMethod.GET)
    @ResponseBody
    public List<CityPojo> getCityPojo(){
        return cityService.getAllPojo();
    }

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    @ResponseBody
    public void set(){
        City city = new City("Курган");
        City city1 = new City("Тюмень");
        City city2 = new City("Екатеринбург");
        City city3 = new City("Москва");
        cityService.save(city);
        cityService.save(city1);
        cityService.save(city2);
        cityService.save(city3);
    }


}
