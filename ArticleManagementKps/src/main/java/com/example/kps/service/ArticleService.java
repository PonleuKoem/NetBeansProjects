/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.service;

import com.example.kps.model.ArticleModel;
import com.example.kps.model.Filter.ArticleFilter;
import java.util.List;

/**
 *
 * @author UC
 */
public interface ArticleService {
    List<ArticleModel> findAllarticle(ArticleFilter filter);
    List<ArticleModel> findAllarticle1();
    List<ArticleModel> findAll(ArticleFilter filter);
    ArticleModel findOne(int id);
    boolean save(ArticleModel article);
    boolean remove(int id);
    boolean update(ArticleModel article);
    List<ArticleModel>Search(ArticleFilter filter);
    
}
