package com.jahan.samiul.redistest.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Product implements Serializable {

    private int id;
    private String name;

    public Product() {

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
}
