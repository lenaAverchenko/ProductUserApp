package com.telran.userproject.service;

import com.telran.userproject.model.Basket;
import com.telran.userproject.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void addUser() throws NoSuchAlgorithmException {
        userService.addUser(new User("Tok", "Udov", "TUlog", "123sdd851", new Basket(), 33));
        assertEquals(4,userService.getAll().size());
        assertEquals("Tok", userService.getByLogin("TUlog").getName());
        assertEquals("Udov", userService.getByLogin("TUlog").getSurname());
        assertEquals(33, userService.getByLogin("TUlog").getAge());
    }

    @Test
    void addToBasket() {
        //
    }

    @Test
    void getAll() {
        //
    }

    @Test
    void getByLogin() {
        assertNotNull(userService.getByLogin("AAlog"));
        assertEquals("Anna", userService.getByLogin("AAlog").getName());
        assertEquals("Anova", userService.getByLogin("AAlog").getSurname());
        assertEquals(25, userService.getByLogin("AAlog").getAge());
    }
}