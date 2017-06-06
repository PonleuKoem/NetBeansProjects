/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khmeracademy.app.repository;

import java.util.ArrayList;
import org.khmeracademy.app.model.Product;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
public interface ProductRepository {

    public ArrayList<Product> getAllProduct();
}
