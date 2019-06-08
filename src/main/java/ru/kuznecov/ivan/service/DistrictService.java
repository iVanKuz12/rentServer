package ru.kuznecov.ivan.service;

import ru.kuznecov.ivan.entity.District;

import java.util.List;

public interface DistrictService {
    List<District> getAll();

    List<District> getAllParentId(long parentId);


    void save(District district);
}
