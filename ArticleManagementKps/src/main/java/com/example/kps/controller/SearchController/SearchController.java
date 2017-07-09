/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.controller.SearchController;

import com.example.kps.model.ArticleModel;
import com.example.kps.model.Filter.ArticleFilter;
import com.example.kps.repository.ArticleRepository;
import com.example.kps.service.ArticleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UC
 */
@RestController
public class SearchController {
    @Autowired
    private ArticleRepository articles;
    @GetMapping("/article/search")
    public List<ArticleModel> searchArticle(ArticleFilter filter){
        System.out.println("error");
        System.out.println(articles);
        return articles.Search(filter);
    } 
}
