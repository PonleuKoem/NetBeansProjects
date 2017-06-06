/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Person;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public class PersonRepositoryImp implements PersonRepository {

    @Override
    public ArrayList<Person> getAllPerson() {
        ArrayList<Person> persons=new ArrayList<Person>();
        for(int i=0;i<10;i++)
        {
            persons.add(new Person(i,"User"+i,"male"));
        }
        return persons;
    }
    
}
