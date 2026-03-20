/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.storage.storageservice.controllers;

import com.storage.storageservice.models.ProductModel;
import com.storage.storageservice.services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lab
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    
    @GetMapping()
    public List<ProductModel> getProducts(){
        return productService.listProducts();
    }
    
    @PostMapping()
    public ProductModel setProduct(ProductModel product){
        return productService.saveProduct(product);
    }
}
