package com.codegym.cms.service;

import com.codegym.cms.model.Province;

import java.util.Optional;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save (Province province);

    void remove(Long id);
}
