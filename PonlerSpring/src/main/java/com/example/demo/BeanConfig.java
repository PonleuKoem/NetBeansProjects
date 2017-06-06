/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.shape.*;
import org.springframework.context.annotation.*;

/**
 *
 * @author User
 */
@Configuration
public class BeanConfig {
//    @Bean(name="dcir")
//    public Drawing drawc()
//    {
//        Drawing d=new Drawing();
//        d.setShape(new Circle());
//        return d;
//    }
//    @Bean(name="dtri")
//    public Drawing drawt()
//    {
//        Drawing d=new Drawing();
//        d.setShape(new Triangle());
//        return d;
//    }
//    @Bean(name="drec")
//    public Drawing drawr()
//    {
//        Drawing d=new Drawing();
//        d.setShape(new Rectangle());
//        return d;
//    }
    @Bean(name="rec")
    public Rectangle rectangle()
    {
        return new Rectangle();
    }
    @Bean(name="tri")
    public Triangle triangle()
    {
        return new Triangle();
    }
    @Bean(name="cir")
    public Circle circle()
    {
        return new Circle();
    }
    
}
