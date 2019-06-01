package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznecov.ivan.entity.City;



public interface CityRepository extends JpaRepository<City, Long> {


}
