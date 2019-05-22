package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kuznecov.ivan.entity.User;
import ru.kuznecov.ivan.service.UserService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private static final String OK = "OK";
    private static final String ERROR = "ERROR";

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(){
        return userService.getAll();
    }

    @RequestMapping(value = "/getByEmailAndPhone" , method = RequestMethod.GET)
    @ResponseBody
    public User getByEmailAndPhone (@RequestParam("email") String email, @RequestParam("phone") String phone ) {
        return userService.getByEmailAndPhone(email, phone);
    }

    @RequestMapping(value = "/getByEmailAndPassword" , method = RequestMethod.POST)
    @ResponseBody
    public User getByEmailAndPassword (@RequestBody User user) {
        return userService.getByEmailAndPassword(user.getEmail(), user.getPassword());
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    public User getUser( @RequestParam("id") long id){
        return userService.getById(id);
    }

    @RequestMapping(value = "/setUser", method = RequestMethod.POST)
    @ResponseBody
    public User saveUser(@RequestBody User user){
        user.setDate(new Date());
        userService.save(user);
        String email = user.getEmail();
        String password = user.getPassword();
        return userService.getByEmailAndPassword(email, password);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public User updUser(@RequestBody User user){
        user.setDate(new Date());
        userService.save(user);
        String email = user.getEmail();
        String password = user.getPassword();
        return userService.getByEmailAndPassword(email, password);
    }

    //Registration
    @RequestMapping(value = "/email", method = RequestMethod.GET)
    @ResponseBody
    public String getEmail(@RequestParam("email") String email){
        if (userService.getByEmail(email) == null)
            return OK;
        return ERROR;
    }

    @RequestMapping(value = "/phone", method = RequestMethod.GET)
    @ResponseBody
    public String getPhone(@RequestParam("phone") String phone){
        if (userService.getByPhone(phone) == null)
            return OK;
        return ERROR;
    }
}
