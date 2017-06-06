/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author User
 */
@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public ArrayList<Person> getAllPerson() {
        return personRepository.getAllPerson();
    }
   
}
