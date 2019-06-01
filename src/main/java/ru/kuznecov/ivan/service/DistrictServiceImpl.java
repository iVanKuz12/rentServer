package ru.kuznecov.ivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuznecov.ivan.entity.District;
import ru.kuznecov.ivan.repository.DistrictRepository;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    DistrictRepository districtRepository;

    @Override
    public List<District> getAll() {
        return districtRepository.findAll();
    }


    @Override
    public void save(District district) {
        districtRepository.saveAndFlush(district);
    }
}

