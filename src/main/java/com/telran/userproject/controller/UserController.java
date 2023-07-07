package com.telran.userproject.controller;

import com.telran.userproject.model.Product;
import com.telran.userproject.model.User;
import com.telran.userproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // отрабатывает все, кроме добавления этого пользователя, возможно, из-за пароля
    // тест этот метод отрабатывает нормально, проблема в том, что не могу понять, почему постман возвращает ошибку
    @PostMapping("/add_user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PostMapping("/add_product/{login}")
    public Product addToBasket(@RequestBody Product product, @PathVariable(name = "login") String login) {
        return userService.addToBasket(product, login);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{login}")
    public User getByLogin(@PathVariable(name = "login") String login) {
        return userService.getByLogin(login);
    }
}
