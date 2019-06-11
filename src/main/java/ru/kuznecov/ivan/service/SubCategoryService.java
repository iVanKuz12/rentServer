package ru.kuznecov.ivan.service;

import ru.kuznecov.ivan.entity.SubCategory;

import java.util.List;

public interface SubCategoryService {
    List<SubCategory> getAll();
    List<SubCategory> getAllParentId(long id);
}
