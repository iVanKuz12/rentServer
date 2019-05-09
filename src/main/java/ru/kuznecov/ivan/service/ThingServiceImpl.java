package ru.kuznecov.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuznecov.ivan.entity.Thing;
import ru.kuznecov.ivan.repository.ThingRepository;

import java.util.List;
@Service
public class ThingServiceImpl implements ThingService {

    @Autowired
    ThingRepository thingRep;

    @Override
    public List<Thing> getAll() {
        return thingRep.findAll();
    }

    @Override
    public Thing getById(long id) {
        return thingRep.findOne(id);
    }

    @Override
    public void save(Thing thing) {
        thingRep.saveAndFlush(thing);
    }

    @Override
    public void remove(long id) {
        thingRep.delete(id);
    }
}

