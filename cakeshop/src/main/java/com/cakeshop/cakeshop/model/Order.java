package com.cakeshop.cakeshop.model;

import java.util.ArrayList;

public class Order {
    private int id;
    private double price;
    private ArrayList<Integer> cakes;

    public Order(int id, double price, ArrayList<Integer> cakes) {
        this.id = id;
        this.price = price;
        this.cakes = cakes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Integer> getCakes() {
        return cakes;
    }

    public void setCakes(ArrayList<Integer> cakes) {
        this.cakes = cakes;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", cakes=" + cakes +
                '}';
    }
}
