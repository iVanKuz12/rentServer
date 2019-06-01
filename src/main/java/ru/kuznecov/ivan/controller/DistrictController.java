package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kuznecov.ivan.entity.District;
import ru.kuznecov.ivan.service.DistrictService;

import java.util.List;

@RestController
@RequestMapping(value = "/district")
public class DistrictController {
    private static final String OK = "OK";
    private static final String ERROR = "ERROR";

    @Autowired
    private DistrictService districtService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<District> getD(){
        return districtService.getAll();
    }




}
