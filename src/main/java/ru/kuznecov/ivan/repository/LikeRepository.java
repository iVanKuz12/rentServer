package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznecov.ivan.entity.Like;


public interface LikeRepository extends JpaRepository<Like, Long> {


}
