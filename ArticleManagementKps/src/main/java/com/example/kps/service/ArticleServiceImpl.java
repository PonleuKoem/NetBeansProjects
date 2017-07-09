/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.service;

import com.example.kps.model.ArticleModel;
import com.example.kps.model.Filter.ArticleFilter;
import com.example.kps.repository.ArticleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author UC
 */
@Service
public class ArticleServiceImpl implements ArticleService{
    private ArticleRepository articleRepository;
    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }
    @Override
    public ArticleModel findOne(int id) {
        return articleRepository.findOne(id);
    }

    @Override
    public boolean save(ArticleModel article) {
        return articleRepository.save(article);
    }

    @Override
    public boolean remove(int id) {
        return articleRepository.remove(id);
    }

    @Override
    public boolean update(ArticleModel article) {
        return articleRepository.update(article);
    }

    @Override
    public List<ArticleModel> findAllarticle(ArticleFilter filter) {
        List<ArticleModel> articles = articleRepository.findAllarticle(filter);
        return articles;
    }

    @Override
    public List<ArticleModel> findAll(ArticleFilter filter) {
        
//        List<ArticleModel> articles = articleRepository.findAll(page,limit, filter);
        List<ArticleModel> articles=articleRepository.findAll(filter);
//        int i = articleRepository.findAllarticle().size();
//        int k = i/filter.getLimit();
//        int pg;
//        if(i%filter.getLimit()==0){
//            pg = k;
//        }else{
//            pg=k+1;
//        }
//        System.out.println("hello"+pg+" : "+articleRepository.findAllarticle().size()+":"+i);
        return articles;
    }

    @Override
    public List<ArticleModel> Search(ArticleFilter filter) {
        List<ArticleModel> artiles=articleRepository.Search(filter);
        return artiles;
    }

    @Override
    public List<ArticleModel> findAllarticle1() {
        List<ArticleModel> articlesAll=articleRepository.findAllarticle1();
        return articlesAll;
    }
    
}
