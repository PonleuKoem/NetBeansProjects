/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import Person.PersonInfoMethod;
import Person.info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author User
 */
@Configuration
public class BeanConfig {
//    @Bean(name="info")
//    public PersonInfoMethod info(){
//        PersonInfoMethod d = new PersonInfoMethod();
//        d.setPeron(new info());
//        return d;
//    }
    @Bean(name="info")
    public info setInfo(){
        return new info();
    }
}
