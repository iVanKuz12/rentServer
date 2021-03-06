package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kuznecov.ivan.entity.Comment;
import ru.kuznecov.ivan.service.CommentService;

import java.util.List;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    private static final String OK = "OK";
    private static final String ERROR = "ERROR";

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Comment> getAll(){
        return commentService.getAll();
    }

}
