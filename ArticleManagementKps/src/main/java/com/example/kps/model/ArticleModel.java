/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.model;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.NotEmpty;


/**
 *
 * @author UC
 */
public class ArticleModel {
    @Min(1)
    private int id;
    @Size(min=4, message="Title must be greater than 4!!!")
    private String title;
    @NotEmpty(message = "Please type any description")
    private String description;
    @NotEmpty(message="Author name cannot be empty!!!")
    private String author;
    @Min(1)
    private int category_id;
    private String thumbnail;    
    private Category category;
    public ArticleModel() {
        super();
    }

    public ArticleModel(int id, String title, String description, String author, int category_id, String thumbnail, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.category_id = category_id;
        this.thumbnail = thumbnail;
        this.category = category;
    }

    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ArticleModel{" + "id=" + id + ", title=" + title + ", description=" + description + ", author=" + author + ", category_id=" + category_id + ", thumbnail=" + thumbnail + ", category=" + category + '}';
    }

    
    
}
