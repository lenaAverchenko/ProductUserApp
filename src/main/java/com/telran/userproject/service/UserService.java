package com.telran.userproject.service;

import com.telran.userproject.model.Product;
import com.telran.userproject.model.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    Product addToBasket(Product product, String login);

    List<User> getAll();

    User getByLogin(String login);
}
