package com.cakeshop.cakeshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "orders")
public class Order {
    @Id
    private int id;
    @Field(name="price")
    private double price;
    @Field(name="cakes")
    private List<Cake> cakes;

    public Order(int id, double price, List<Cake> cakes) {
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

    public List<Cake> getCakes() {
        return cakes;
    }

    public void setCakes(List<Cake> cakes) {
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
