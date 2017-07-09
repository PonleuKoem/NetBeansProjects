/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Article;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UC
 */
@Repository
public interface ArticleRepository {
    List<Article> findAll();
    Article findOne(int id);
    boolean save(Article article);
    boolean remove(Article article);
}
