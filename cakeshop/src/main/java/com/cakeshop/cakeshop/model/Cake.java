package com.cakeshop.cakeshop.model;

import java.io.Serializable;

public class Cake implements Serializable {
    private int id;
    private String name;
    private String glaze;
    private String filling;
    private double price;

    public Cake(int id, String name, String glaze, String filling, double price) {
        this.id = id;
        this.name = name;
        this.glaze = glaze;
        this.filling = filling;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGlaze() {
        return glaze;
    }

    public void setGlaze(String glaze) {
        this.glaze = glaze;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", glaze='" + glaze + '\'' +
                ", filling='" + filling + '\'' +
                ", price=" + price +
                '}';
    }
}
