package com.example.mypraticeproject.factorymethodpattern.product;

public class ProductA implements Product {

    @Override
    public void create() {
        System.out.println("ProductA created.");
    }
}
