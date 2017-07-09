/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.service;

import com.example.kps.model.ArticleModel;
import com.example.kps.model.Category;
import com.example.kps.model.Filter.ArticleFilter;
import com.example.kps.repository.ArticleRepository;
import com.example.kps.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author UC
 */
@Service
public class CategoryServiceIpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;
//    @Autowired
//    public CategoryServiceIpl(CategoryReposity category ){
//        this.category = category;
//    }

    @Override
    public List<Category> findAllCategory() {
        return null;
    }

    @Override
    public List<Category> findAll() {
        List<Category> category=categoryRepository.findAll();
        return category;
    }

    

    
    
    
}
