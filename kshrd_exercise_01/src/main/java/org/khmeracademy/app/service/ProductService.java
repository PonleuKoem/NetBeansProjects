/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khmeracademy.app.service;

import java.util.ArrayList;
import org.khmeracademy.app.model.Product;

/**
 *
 * @author User
 */
public interface ProductService {
    ArrayList<Product> getAllProduct();
    ArrayList<Product> getProducts();
}
