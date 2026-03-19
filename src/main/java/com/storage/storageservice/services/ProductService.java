/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.storage.storageservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.storage.storageservice.models.ProductModel;
import com.storage.storageservice.repositories.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author lab
 */
@Service
public class ProductService {

    ProductRepository productRepository;
    
    public List<ProductModel> listProducts(){
        return (List<ProductModel>)productRepository.findAll();
    }
    
    public ProductModel saveProduct(ProductModel product){
        return productRepository.save(product);
    }
    
}




