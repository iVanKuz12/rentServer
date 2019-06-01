package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kuznecov.ivan.entity.Like;
import ru.kuznecov.ivan.service.LikeService;

import java.util.List;

@RestController
@RequestMapping(value = "/like")
public class LikeController {
    private static final String OK = "OK";
    private static final String ERROR = "ERROR";

    @Autowired
    private LikeService likeService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Like> getAll(){
        return likeService.getAll();
    }
    
}
