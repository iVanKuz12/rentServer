package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kuznecov.ivan.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailAndPhone(String email, String phone);
    User findByEmailAndPassword(String email, String password);
    User findByEmail(String email);
    User findByPhone(String phone);



  /*  @Query("SELECT b FROM Users b ORDER BY b.date DESC ")
    List<User> fAl();*/

}
