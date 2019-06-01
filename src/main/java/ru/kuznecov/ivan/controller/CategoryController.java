package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kuznecov.ivan.entity.Category;
import ru.kuznecov.ivan.service.CategoryService;


import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
    private static final String OK = "OK";
    private static final String ERROR = "ERROR";

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getCat(){
        return categoryService.getAll();
    }


}
