package com.codegym.cms.service;

import com.codegym.cms.model.Blogs;

import java.util.List;

public interface BlogService {
    List<Blogs> findAll();

    Blogs findById (Long id);

    void save (Blogs blogs);

    void remove (Long id);
}
