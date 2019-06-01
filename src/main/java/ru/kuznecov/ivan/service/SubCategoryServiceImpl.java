package ru.kuznecov.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuznecov.ivan.entity.District;
import ru.kuznecov.ivan.entity.SubCategory;
import ru.kuznecov.ivan.repository.DistrictRepository;
import ru.kuznecov.ivan.repository.SubCategoryRepository;

import java.util.List;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{

    @Autowired
    SubCategoryRepository subCategoryRepository;

    @Override
    public List<SubCategory> getAll() {
        return subCategoryRepository.findAll();
    }
}

