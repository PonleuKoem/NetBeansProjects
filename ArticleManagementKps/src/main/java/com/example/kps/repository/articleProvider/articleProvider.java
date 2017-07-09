/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.repository.articleProvider;

import com.example.kps.model.Filter.ArticleFilter;
import org.apache.ibatis.jdbc.SQL;


/**
 *
 * @author UC
 */
public class articleProvider {
    public String Search(ArticleFilter filter){
        return new SQL(){{
        SELECT("A.id, A.title, A.description, A.author, A.thumbnail, A.category_id");        
                SELECT("C.id AS categoryid,C.name");
                FROM("tbl_articles A");                
                INNER_JOIN("tbl_category C ON C.id=A.category_id");
        if(filter.getName()!=null)
            WHERE("name ILIKE '%' || #{name} || '%'");
        if(filter.getId()!=null)
            WHERE("C.id = #{id}");
        
        }}.toString();
    }
    public String findAllArticles(ArticleFilter filter){
        return new SQL(){{
            SELECT("COUNT(a.id)");
            FROM("tbl_articles a");
            INNER_JOIN("tbl_category C ON C.id=A.category_id");
                if(filter.getId()!=null)
                    WHERE("C.id =#{id}");
                if(filter.getName()!=null)
                    WHERE("A.title ILIKE '%' || #{name} || '%'");
            GROUP_BY("a.id");
            }}.toString();
    }
    public String findAllArticles1(){
        return new SQL(){{
            SELECT("*");
            FROM("tbl_articles");
            ORDER_BY("id ASC");
            }}.toString();
    }
    
     public String findAll(ArticleFilter filter){
        return new SQL(){{
                SELECT("A.id, A.title, A.description, A.author, A.thumbnail, A.category_id");        
                SELECT("C.id AS categoryid,C.name");
                FROM("tbl_articles A");                
                INNER_JOIN("tbl_category C ON C.id=A.category_id");
                if (filter.getPage()!=null)   {                    
                    ORDER_BY("A.id ASC LIMIT #{limit} OFFSET #{offset}");
                }
                if(filter.getId()!=null)
                    WHERE("C.id =#{id}");
                if(filter.getName()!=null)
                    WHERE("A.title ILIKE '%' || #{name} || '%'");
                 
            }}.toString();
    }
     
    public String findOne(){
        return new SQL(){{
            SELECT("id, title, description, author, thumbnail, category_id");
            FROM("tbl_articles");
            WHERE("id=#{id}");
            }}.toString();
    }
    
    //"INSERT INTO tbl_articles(id, title, description, author, thumbnail) values(#{id}, #{title}, #{description}, #{author}, #{thumbnail})"
    public String save(){
        return new SQL(){{
            INSERT_INTO("tbl_articles");
            VALUES("id",  "#{id}");
            VALUES("title",  "#{title}");
            VALUES("description",  "#{description}");
            VALUES("author",  "#{author}");
            VALUES("thumbnail",  "#{thumbnail}");
            VALUES("category_id",  "#{category_id}");
        }}.toString();
    }
//    "DELETE FROM tbl_articles where id=#{id}"
    public String remove(){
        return new SQL(){{
            DELETE_FROM("tbl_articles");
            WHERE("id=#{id}");
        }}.toString();
    }
    public String update(){
        return new SQL(){{
//            "UPDATE  SET id=, title=#{title}, description=#{description}, author=#{author}, thumbnail=#{thumbnail} WHERE id=#{id}"
            UPDATE("tbl_articles");
            SET("id=#{id}");
            SET("title=#{title}");
            SET("description=#{description}");
            SET("author=#{author}");
            SET("thumbnail=#{thumbnail}");
            WHERE("id=#{id}");
            
            
        }}.toString();
        
    }
}   
