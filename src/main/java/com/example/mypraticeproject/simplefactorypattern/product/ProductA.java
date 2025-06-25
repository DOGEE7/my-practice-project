package com.example.mypraticeproject.simplefactorypattern.product;

public class ProductA implements Product {

    @Override
    public void create() {
        System.out.println("ProductA created.");
    }
}
