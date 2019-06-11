package ru.kuznecov.ivan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznecov.ivan.entity.Thing;

import java.util.List;


public interface ThingRepository extends JpaRepository<Thing, Long> {

    List<Thing> getAllByStatus(int status);

}

