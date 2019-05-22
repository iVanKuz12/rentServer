package ru.kuznecov.ivan.service;

import ru.kuznecov.ivan.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    /*List<User> getfAl();*/

    User getById(long id);

    User getByEmail(String email);

    User getByPhone(String phone);

    User getByEmailAndPhone(String email, String phone);

    User getByEmailAndPassword(String email, String password);

    void save(User user);

    void remove(long id);

}
