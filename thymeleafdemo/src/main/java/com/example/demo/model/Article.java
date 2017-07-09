/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

/**
 *
 * @author UC
 */
public class Article {
    private int id;
    private String title;
    private String author;
    private String description;
    private String thumnail;

    public Article(int id, String title, String author, String description, String thumnail) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.thumnail = thumnail;
    }

    public Article() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", title=" + title + ", author=" + author + ", description=" + description + ", thumnail=" + thumnail + '}';
    }
    
}
