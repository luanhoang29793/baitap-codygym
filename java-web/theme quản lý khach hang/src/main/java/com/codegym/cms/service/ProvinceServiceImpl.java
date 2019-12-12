package com.codegym.cms.service;

import com.codegym.cms.model.Province;
import com.codegym.cms.repository.provinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private provinceRepository ProvinceRepository;
    @Override
    public Iterable<Province> findAll() {
        return ProvinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return ProvinceRepository.findById(id).get();
    }

    @Override
    public void save(Province province) {
    ProvinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
    ProvinceRepository.deleteById(id);
    }
}
