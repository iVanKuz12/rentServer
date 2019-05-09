package ru.kuznecov.ivan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznecov.ivan.entity.Thing;



public interface ThingRepository extends JpaRepository<Thing, Long> {

}

