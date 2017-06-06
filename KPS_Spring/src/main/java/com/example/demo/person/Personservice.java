/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author User
 */
@Component
public class Personservice {
    private Person person;
    public Personservice(Person person)
    {
        this.person=person;
    }
    public Personservice()
    {   
    }
//    @Autowired
//    @Qualifier("police")
    public void setPerson(Person person)
    {
        this.person=person;
    }
    public void personSay()
    {
        person.sayHello();
    }
}
