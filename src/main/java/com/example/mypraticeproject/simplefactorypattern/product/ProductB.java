package com.example.mypraticeproject.simplefactorypattern.product;

public class ProductB implements Product {

    @Override
    public void create() {
        System.out.println("ProductB created.");
    }
}
