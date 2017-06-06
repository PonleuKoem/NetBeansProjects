package org.khmeracademy.app.repository;


import java.util.ArrayList;
import org.khmeracademy.app.model.Product;
import org.khmeracademy.app.repository.ProductRepository;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
@Repository
public class ProductRepositoryImp implements ProductRepository{
    @Override
    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> products=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            products.add(new Product(i,"name"+i,i+5));
        }
        return products;
    }
}
