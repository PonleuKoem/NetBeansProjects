/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.repository;

import com.example.kps.model.ArticleModel;
import com.example.kps.model.Category;
import java.util.List;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UC
 */
@Repository
public interface CategoryRepository {
    @Select("SELECT * FROM tbl_category")
            @Results({
                @Result(property = "id", column = "id"),
                @Result(property = "name", column = "name"),
                @Result(property = "articles", column = "id", many = @Many(select = "findAllArticleById"))
            })
    List<Category>findAll();
    
    @Select("SELECT * FROM tbl_articles where category_id=#{id}")
    public List<Category>findAllArticleById(Integer id);
}
