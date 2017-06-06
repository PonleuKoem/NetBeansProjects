/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author User
 */
@Component
public class Drawing {
    private Shape shape;
//    @Autowired
//    @Qualifier("rec")
    public void setShape(Shape shape)
    {
        this.shape=shape;
    }
    public void drawShape()
    {
        this.shape.draw();
    }
}
