/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author UC
 */
@Controller
public class ArticleController {
    private ArticleService  articleservice;
    public ArticleController(ArticleService articleservice){
        this.articleservice=articleservice;
    }
    @RequestMapping("/article")
    public String ArticlePage(ModelMap model){
        List<Article> articles = articleservice.findAll();
        model.addAttribute("articles",articles);
        return "/article";
    }
}
