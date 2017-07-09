/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.service;

import com.example.kps.model.ArticleModel;
import com.example.kps.model.Category;
import com.example.kps.model.Filter.ArticleFilter;
import java.util.List;

/**
 *
 * @author UC
 */
public interface CategoryService {
    List<Category> findAllCategory();
    List<Category> findAll();
    
}
