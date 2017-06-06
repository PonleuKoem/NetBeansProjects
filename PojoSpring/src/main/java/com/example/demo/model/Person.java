/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

/**
 *
 * @author User
 */
public class Person {
    private int id;
    private String name;
    private String gender;

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString()
    {
        return "ID\t: "+this.id+"Name\t: "+this.name+"Gender\t: "+this.gender;
    }
}
