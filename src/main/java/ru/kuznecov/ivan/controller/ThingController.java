package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kuznecov.ivan.entity.Thing;
import ru.kuznecov.ivan.service.ThingService;


import java.util.List;

@RestController
@RequestMapping(value = "/thing")
public class ThingController {

    @Autowired
    private ThingService thingService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Thing> getThings(){
        return thingService.getAllByStatus();
    }

    @RequestMapping(value = "/getOne")
    @ResponseBody
    public Thing getThing(@RequestParam("id") long id){
        return thingService.getById(id);
    }

    @RequestMapping(value = "/addThing", method = RequestMethod.POST)
    @ResponseBody
    public long saveThing(@RequestBody Thing thing){
        long id = thingService.save(thing);
        return id;
    }
    @RequestMapping(value = "/addPhotoThing", method = RequestMethod.POST)
    @ResponseBody
    public String savePhotoThing(@RequestBody Thing thing){
        return thingService.savePhoto(thing);
    }
}
