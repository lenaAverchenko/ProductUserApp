package com.telran.userproject.service;

import com.telran.userproject.model.Product;
import com.telran.userproject.model.User;
import com.telran.userproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public Product addToBasket(Product product, String login) {
        return userRepository.addToBasket(product, login);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User getByLogin(String login) {
        return userRepository.getByLogin(login);
    }
}
