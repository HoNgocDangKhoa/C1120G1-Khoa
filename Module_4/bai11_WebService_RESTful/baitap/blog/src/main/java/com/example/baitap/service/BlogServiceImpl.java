package com.example.baitap.service;


import com.example.baitap.entity.Blog;
import com.example.baitap.entity.Category;
import com.example.baitap.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public List<Blog> findAllByCategoryId(Long id) {
        return blogRepository.findAllByCategoryId(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }


    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }


}
