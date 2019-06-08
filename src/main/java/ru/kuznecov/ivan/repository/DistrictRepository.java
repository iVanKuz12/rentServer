package ru.kuznecov.ivan.repository;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kuznecov.ivan.entity.City;
import ru.kuznecov.ivan.entity.District;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District, Long> {
    @Query(value = "SELECT d FROM District d WHERE d.cityId = ?1")
    List<District> myQue(long id);


}
