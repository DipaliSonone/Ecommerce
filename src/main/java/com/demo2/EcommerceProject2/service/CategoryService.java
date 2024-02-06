package com.demo2.EcommerceProject2.service;

import com.demo2.EcommerceProject2.entity.Category;
import com.demo2.EcommerceProject2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public void createCategory(Category category){
    categoryRepository.save(category);
    }

}
