package ru.kuznecov.ivan.service;

import ru.kuznecov.ivan.entity.Thing;

import java.util.List;

public interface ThingService {

    List<Thing> getAll();

    Thing getById(long id);

    void save(Thing thing);

    void remove(long id);

}

