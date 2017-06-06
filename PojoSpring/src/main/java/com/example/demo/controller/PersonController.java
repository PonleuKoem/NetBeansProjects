/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author User
 */
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/")
    public String index()
    {
        for(Person p:personService.getAllPerson())
        {
            System.out.println(p.toString());
        }
        return "index";
    }
    public String personResult()
    {
        return "result";
    }
    
}
