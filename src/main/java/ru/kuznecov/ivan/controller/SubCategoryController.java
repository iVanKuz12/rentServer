package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kuznecov.ivan.entity.SubCategory;
import ru.kuznecov.ivan.service.SubCategoryService;

import java.util.List;

@RestController
@RequestMapping(value = "/subCategory")
public class SubCategoryController {
    private static final String OK = "OK";
    private static final String ERROR = "ERROR";

    @Autowired
    private SubCategoryService subCategoryService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<SubCategory> getSCat(){
        return subCategoryService.getAll();
    }

}
