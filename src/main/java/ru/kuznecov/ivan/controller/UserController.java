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

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(){
      /*  User user = new User();
        user.setName("Ivan");
        user.setDate(new Date());
        user.setPhone("89512693636");
        user.setEmail("neo123.09@gmail.com");
        user.setPassword("neo12309");
        userService.save(user);*/

        /*User user1 = new User();
        user1.setName("Ivan2");
        user1.setPhone("89512696363");
        user1.setEmail("neo123.09@gmail.ru");
        user1.setDate(new Date());
        userService.save(user1);*/


        return userService.getAll();
    }

    @RequestMapping(value = "/getByEmailAndPhone" , method = RequestMethod.GET)
    @ResponseBody
    public User getByEmailAndPhone (@RequestParam("email") String email, @RequestParam("phone") String phone ) {
        return userService.getByEmailAndPhone(email, phone);
    }

    @RequestMapping(value = "/getByEmailAndPassword" , method = RequestMethod.GET)
    @ResponseBody
    public User getByEmailAndPassword (@RequestParam("email") String email, @RequestParam("password") String password ) {
        return userService.getByEmailAndPassword(email, password);
    }

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    @ResponseBody
    public User getUser( @RequestParam("id") long id){
        return userService.getById(id);
    }

    @RequestMapping(value = "/setOne", method = RequestMethod.POST)
    @ResponseBody
    public void saveUser(@RequestBody User user){
        user.setDate(new Date());
        userService.save(user);
    }
}
