/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khmeracademy.app.service;

import java.util.ArrayList;
import org.khmeracademy.app.model.Product;
import org.khmeracademy.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ArrayList<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public ArrayList<Product> getProducts() {
        ArrayList<Product> pro = new ArrayList<Product>();
        for(Product pr:this.productRepository.getAllProduct()){
            if(pr.getPrice()<14){
                pro.add(pr);
            }
            
        }
        return pro;
    }
    
    
}
