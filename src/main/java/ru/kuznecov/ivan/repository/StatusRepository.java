package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznecov.ivan.entity.Status;


public interface StatusRepository extends JpaRepository<Status, Long> {


}
