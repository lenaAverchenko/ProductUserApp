package com.telran.userproject.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> basketList = new ArrayList<>();

    public Basket() {
    }

    public List<Product> getBasketList() {
        return basketList;
    }

    public void setBasketList(List<Product> basketList) {
        this.basketList = basketList;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketList=" + basketList +
                '}';
    }
}
