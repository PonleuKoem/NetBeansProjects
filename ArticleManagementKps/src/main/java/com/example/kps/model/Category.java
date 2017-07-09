/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.model;

import java.util.List;

/**
 *
 * @author UC
 */

public class Category {
    private int id;
    private String name;
    List<ArticleModel>articles;
    public Category() {
        super();
    }
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {        
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleModel> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", articles=" + articles + '}';
    }
    
    
    
}
