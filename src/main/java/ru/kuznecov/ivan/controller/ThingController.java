package ru.kuznecov.ivan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kuznecov.ivan.entity.Thing;
import ru.kuznecov.ivan.repository.ThingRepository;
import ru.kuznecov.ivan.service.ThingService;


import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/thing")
public class ThingController {

   /* @Autowired
    private ThingRepository thingRepository;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Thing> getThings(){
        return thingRepository.findAll();
    }*/

    @Autowired
    private ThingService thingService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Thing> getThings(){
        return thingService.getAll();
    }

    @RequestMapping(value = "/getOne")
    @ResponseBody
    public Thing getThing(@RequestParam("id") long id){
        return thingService.getById(id);
    }

    @RequestMapping(value = "/setOne", method = RequestMethod.POST)
    @ResponseBody
    public void saveThing(@RequestBody Thing thing){
        thing.setCategorId(0);
        thing.setCityId(0);
        thing.setDate(new Date());
        thing.setPhoto("http");
        thing.setStatus(1);
        thingService.save(thing);
    }
}
