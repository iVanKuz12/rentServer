package ru.kuznecov.ivan.service;


import ru.kuznecov.ivan.entity.Comment;
import java.util.List;

public interface CommentService {
    List<Comment> getAll();
}
