package com.telran.userproject.repository;

import com.telran.userproject.model.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    Map<Integer, Product> products = new HashMap<>();

    @PostConstruct
    private void init() {
        products.put(1258, new Product("Book", 1258, 45.25));
        products.put(4589, new Product("Ring", 4589, 99.99));
        products.put(8963, new Product("Toy", 8963, 80.00));
        products.put(5972, new Product("Pillow", 5972, 10.50));
        products.put(4196, new Product("Blanket", 4196, 200.00));
    }

    @Override
    public Product addProduct(Product product) {
        products.put(product.getId(), product);
        return product;
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product getById(int id) {
        return products.get(id);
    }
}
