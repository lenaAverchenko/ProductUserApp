package com.telran.userproject.repository;

import com.telran.userproject.model.Product;

import java.util.List;

public interface ProductRepository {

    Product addProduct(Product product);

    List<Product> getAll();

    Product getById(int id);
}
