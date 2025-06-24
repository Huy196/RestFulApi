package com.example.restfullapi.service;


import com.example.restfullapi.model.Category;
import com.example.restfullapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return  categoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
