package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuznecov.ivan.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
