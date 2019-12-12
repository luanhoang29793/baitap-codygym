package com.codegym.cms.service;

import com.codegym.cms.model.Blogs;
import com.codegym.cms.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public List<Blogs> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blogs findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blogs blogs) {
        blogRepository.save(blogs);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}
