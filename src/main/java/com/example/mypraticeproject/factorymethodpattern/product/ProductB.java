package com.example.mypraticeproject.factorymethodpattern.product;

public class ProductB implements Product {

    @Override
    public void create() {
        System.out.println("ProductB created.");
    }
}
