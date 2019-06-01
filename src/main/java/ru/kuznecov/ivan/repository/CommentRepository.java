package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznecov.ivan.entity.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long> {


}
