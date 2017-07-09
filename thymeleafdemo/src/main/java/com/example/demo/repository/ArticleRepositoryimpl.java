/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Article;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UC
 */
@Repository
public class ArticleRepositoryimpl implements ArticleRepository{
    private List<Article> articles;
    public ArticleRepositoryimpl(){
        articles = new ArrayList<>();
        Faker faker = new Faker();
        for(int i =0; i<20; i++){
            Article article = new Article();
            article.setId(i+1);
            article.setTitle(faker.book().title());
            article.setAuthor(faker.book().author());
            article.setDescription(faker.lorem().sentence());
            article.setThumnail("");
            articles.add(article);
        }
    }
    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public Article findOne(int id) {
        return articles.get(id);
    }

    @Override
    public boolean save(Article article) {
        return false;
    }

    @Override
    public boolean remove(Article article) {
        return false;
    }
    
}
