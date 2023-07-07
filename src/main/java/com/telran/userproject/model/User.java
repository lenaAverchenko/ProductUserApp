package com.telran.userproject.model;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class User {

    private String name;
    private String surname;
    private String login;
    private byte[] password;
    private Basket basket;
    private int age;

    public User(String name, String surname, String login, String passwordStr, Basket basket, int age) throws NoSuchAlgorithmException {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = codePassword(passwordStr);
        this.basket = basket;
        this.age = age;
    }

    private byte[] codePassword(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        return messageDigest.digest(password.getBytes(StandardCharsets.UTF_8));
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                '}';
    }
}
