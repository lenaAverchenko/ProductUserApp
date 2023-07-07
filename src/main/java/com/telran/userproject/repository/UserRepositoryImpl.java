package com.telran.userproject.repository;

import com.telran.userproject.model.Basket;
import com.telran.userproject.model.Product;
import com.telran.userproject.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

    Map<String, User> users = new HashMap<>();

    @PostConstruct
    private void init() throws NoSuchAlgorithmException {
        users.put("AAlog", new User("Anna", "Anova", "AAlog", "123asd456", new Basket(), 25));
        users.put("OOlog", new User("Olha", "Olhova", "OOlog", "456fgh789", new Basket(), 40));
        users.put("KNlog", new User("Kolia", "Nikolaev", "KNlog", "789bnm123", new Basket(), 36));
    }

    @Override
    public User addUser(User user) {
        users.put(user.getLogin(), user);
        return user;
    }

    @Override
    public Product addToBasket(Product product, String login) {
        users.get(login).getBasket().getBasketList().add(product);
        return product;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User getByLogin(String login) {
        return users.get(login);
    }
}
