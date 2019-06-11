package ru.kuznecov.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuznecov.ivan.entity.Thing;
import ru.kuznecov.ivan.repository.ThingRepository;

import java.util.Date;
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
    public long save(Thing thing) {
        thing.setDate(new Date());
        thing = thingRep.saveAndFlush(thing);
        return thing.getId();
    }

    @Override
    public String savePhoto(Thing thing) {
        long id = thing.getId();
        Thing getThing = thingRep.findOne(id);
        getThing.setPhoto(thing.getPhoto());
        thingRep.saveAndFlush(getThing);
        return "OK";
    }

    @Override
    public List<Thing> getAllByStatus() {
        return thingRep.getAllByStatus(1);
    }

    @Override
    public void remove(long id) {
        thingRep.delete(id);
    }
}

