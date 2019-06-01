package ru.kuznecov.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuznecov.ivan.entity.Like;
import ru.kuznecov.ivan.repository.LikeRepository;

import java.util.List;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    LikeRepository likeRepository;

    @Override
    public List<Like> getAll() {
        return likeRepository.findAll();
    }
}

