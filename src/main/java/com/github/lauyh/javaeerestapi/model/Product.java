package com.github.lauyh.javaeerestapi.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 9087653L;

    public Product() {
    }

    public Product(Long ID, String name, float price, String category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    private Long ID;
    private String name;
    private double price;

    private String category;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
