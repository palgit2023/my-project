package com.springproject.product.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springproject.product.service.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
