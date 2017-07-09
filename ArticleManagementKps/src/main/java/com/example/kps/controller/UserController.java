package com.example.kps.controller;

import com.example.kps.model.ArticleModel;
import com.example.kps.model.Category;
import com.example.kps.model.Filter.ArticleFilter;
import com.example.kps.service.ArticleService;
import com.example.kps.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UC
 */
@Controller
public class UserController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/")
    public String HomePage(ArticleFilter filter,ModelMap model, Category category){
        
        try{
            
        int page = filter.getPage();
        int limit = filter.getLimit();
        System.out.println(filter);
        //find pg and page for url request
        
        
        int j = articleService.findAllarticle(filter).size();
        System.out.println(j+"size"+articleService.findAllarticle(filter).size());
        int k = j/filter.getLimit();
        int pg;//this is page total count
        if(j%limit==0){
            pg = k;
        }else{
            pg=k+1;
        }
        filter.setPg(pg);
        
        }catch(NullPointerException e){
            filter.setPage(1);
            filter.setLimit(5);
            filter.setOffset(0);
            int j = articleService.findAllarticle(filter).size();
        System.out.println(j+"size"+articleService.findAllarticle(filter).size());
        int k = j/filter.getLimit();
        int pg;//this is page total count
        int limit = filter.getLimit();
        if(j%limit==0){
            pg = k;
        }else{
            pg=k+1;
        }
        filter.setPg(pg);
            System.out.println(filter+""+category+""+e);
        }
        List<ArticleModel> articles = articleService.findAll(filter);
        model.addAttribute("category", category);
        model.addAttribute("filter", filter);
        model.addAttribute("article", articles);
        return "view/index";
    }
    @GetMapping("/article/detail")
    public String HomePage(ModelMap model, @RequestParam("id") Integer id){
        List<Category> category = categoryService.findAll();
        ArticleModel article = articleService.findOne(id);
        model.addAttribute("article", article);
        model.addAttribute("category", category);
        System.out.println("${role}");
        return "view/article-detail";
    }
}
