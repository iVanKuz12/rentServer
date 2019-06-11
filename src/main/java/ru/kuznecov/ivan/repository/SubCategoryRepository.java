package ru.kuznecov.ivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kuznecov.ivan.entity.SubCategory;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

    @Query(value = "SELECT s FROM SubCategory s WHERE s.categoryId = ?1")
    List<SubCategory> getAllParentId(long id);

}
