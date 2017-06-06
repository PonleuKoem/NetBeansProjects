/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khmeracademy.app.controller;

import org.khmeracademy.app.model.Product;
import org.khmeracademy.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author User
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping({"/", "/index"})
    public String index(){
        for(Product p:productService.getAllProduct()){
            System.out.println(p.toString);
        }
        return "index";
    }
    @RequestMapping("/product")
    public String productResult(){
        for(Product p:productService.getAllProduct()){
            System.out.println(p.toString());
        }
        return "product";
    }
    @RequestMapping("/product/price")
    public String productPrice(){
        for(Product p:productService.getProducts()){
            System.out.println(p.toString());
        }
        return "product/price";
    }
}
