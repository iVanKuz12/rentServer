package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(value = "/getAllParentId", method = RequestMethod.GET)
    @ResponseBody
    public List<SubCategory> getAllParentId(@RequestParam("subCategoryParentId") long subCategoryParentId){
        return subCategoryService.getAllParentId(subCategoryParentId);
    }
}
