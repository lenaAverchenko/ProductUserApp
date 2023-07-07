package com.telran.userproject.service;

import com.telran.userproject.model.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);

    List<Product> getAll();

    Product getById(int id);
}
