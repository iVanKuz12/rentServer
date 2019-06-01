package ru.kuznecov.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuznecov.ivan.entity.User;
import ru.kuznecov.ivan.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRep;

    @Override
    public List<User> getAll() {
        return userRep.findAll();
    }

    @Override
    public User getById(long id) {
        return userRep.findOne(id);
    }

    @Override
    public User getByEmail(String email) {
        return userRep.findByEmail(email);
    }

    @Override
    public User getByPhone(String phone) {
        return userRep.findByPhone(phone);
    }

    @Override
    public User getByEmailAndPhone(String email, String phone) {
        return userRep.findByEmailAndPhone(email, phone);
    }

    @Override
    public User getByEmailAndPassword(String email, String password) {
        return userRep.findByEmailAndPassword(email, password);
    }

    @Override
    public void save(User user) {
        userRep.saveAndFlush(user);
    }

    @Override
    public void remove(long id) {
        userRep.delete(id);
    }

    @Override
    public User my(String dis){
        return userRep.myQuery(dis);
    }

 /*   @Override
    public List<User> getfAl(){
        return userRep.fAl();
    }*/
}
