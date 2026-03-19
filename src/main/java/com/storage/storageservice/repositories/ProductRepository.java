/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.storage.storageservice.repositories;

import com.storage.storageservice.models.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lab
 */
@Repository
public interface ProductRepository extends CrudRepository<ProductModel,Long>{
    
}
