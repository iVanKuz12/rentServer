package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kuznecov.ivan.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailAndPhone(String email, String phone);
    User findByEmailAndPassword(String email, String password);
    User findByEmail(String email);
    User findByPhone(String phone);

    @Query(value = "SELECT * FROM users JOIN things on users.id = things.id_user WHERE things.discription = ?1", nativeQuery = true)
    User myQuery(String description);


}
