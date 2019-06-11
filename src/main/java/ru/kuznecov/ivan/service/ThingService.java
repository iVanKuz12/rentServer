package ru.kuznecov.ivan.service;

import ru.kuznecov.ivan.entity.Thing;

import java.util.List;

public interface ThingService {

    List<Thing> getAll();

    Thing getById(long id);

    long save(Thing thing);

    String savePhoto(Thing thing);

    List<Thing> getAllByStatus();

    void remove(long id);

}

