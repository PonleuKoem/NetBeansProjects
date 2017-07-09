/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.repository;

import com.example.kps.model.ArticleModel;
import com.example.kps.model.Filter.ArticleFilter;
import com.example.kps.repository.articleProvider.articleProvider;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.*;

/**
 *
 * @author UC
 */

@Repository
public interface ArticleRepository {  
    @Results({
        @Result(property= "id", column = "id"),
        @Result(property= "title", column = "title"),
        @Result(property= "description", column = "description"),
        @Result(property= "author", column = "author"),
        @Result(property= "thumbnail", column = "thumbnail")
        
        
    })
    @SelectProvider(method = "findAllArticles", type = articleProvider.class)            
    List<ArticleModel> findAllarticle(ArticleFilter filter);
    
    @SelectProvider(method = "findAllArticles1", type = articleProvider.class)
    List<ArticleModel> findAllarticle1();
    
    @SelectProvider(method="findAll", type =articleProvider.class)
    @Results({
        @Result(property= "category.id", column = "categoryid"),
        @Result(property= "category.name", column = "name"),
        @Result(property= "limit", column = "limit"),
        @Result(property= "page", column = "page"),
        @Result(property= "offset", column = "offset")
    })
    List<ArticleModel> findAll(ArticleFilter filter);
    
    @SelectProvider(method = "findOne", type = articleProvider.class)
    ArticleModel findOne(int id);
    @InsertProvider(method = "save", type=articleProvider.class)
    boolean save(ArticleModel article);    
    @DeleteProvider(method = "remove", type = articleProvider.class)
    boolean remove(int id);
    
    @UpdateProvider(method = "update", type = articleProvider.class)
    boolean update(ArticleModel article);
        
    @SelectProvider(method = "Search",type = articleProvider.class)
    List<ArticleModel>Search(ArticleFilter filter);
}
