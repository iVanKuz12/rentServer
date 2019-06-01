package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznecov.ivan.entity.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
