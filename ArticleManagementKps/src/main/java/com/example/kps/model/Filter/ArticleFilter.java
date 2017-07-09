/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kps.model.Filter;

/**
 *
 * @author UC
 */
public class ArticleFilter {
    private Integer id;
    private String name;
    private Integer limit;
    private Integer page;
    private Integer offset;
    private Integer pg;//all page
    public ArticleFilter() {
        super();
    }

    public ArticleFilter(Integer id, String name, Integer limit, Integer page, Integer offset, Integer pg) {
        this.id = id;
        this.name = name;
        this.limit = limit;
        this.page = page;
        this.offset = offset;
        this.pg = pg;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getOffset() {
        offset = (page-1)*limit;
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getPg() {
        return pg;
    }

    public void setPg(Integer pg) {
        this.pg = pg;
    }
    

    @Override
    public String toString() {
        return "ArticleFilter{" + "id=" + id + ", name=" + name + ", limit=" + limit + ", page=" + page + ", offset=" + offset + '}';
    }

    

    
    
}
