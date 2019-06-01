package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kuznecov.ivan.entity.Status;
import ru.kuznecov.ivan.service.StatusService;

import java.util.List;

@RestController
@RequestMapping(value = "/status")
public class StatusController {
    private static final String OK = "OK";
    private static final String ERROR = "ERROR";

    @Autowired
    private StatusService statusService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Status> getAll(){
        return statusService.getAll();
    }
    
}
