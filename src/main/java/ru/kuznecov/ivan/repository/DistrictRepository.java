package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kuznecov.ivan.entity.District;

public interface DistrictRepository extends JpaRepository<District, Long> {




}
