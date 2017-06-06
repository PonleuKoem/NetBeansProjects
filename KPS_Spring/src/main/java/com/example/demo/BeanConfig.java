/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;
import com.example.demo.person.*;
import org.springframework.context.annotation.*;

/**
 *
 * @author User
 */
@Configuration
public class BeanConfig {
    @Bean(name="persert")
    public Personservice persert()
    {
        return new Personservice(new Teacher());
    }
    @Bean(name="perserp")
    public Personservice perserp()
    {
        return new Personservice(new Police());
    }
    @Bean(name="teacher")
    public Teacher teacher()
    {
        return new Teacher();
    }
    @Bean(name="police")
    public Police police()
    {
        return new Police();
    }
}
