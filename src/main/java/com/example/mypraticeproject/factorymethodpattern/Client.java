package com.example.mypraticeproject.factorymethodpattern;

import com.example.mypraticeproject.factorymethodpattern.factory.Factory;
import com.example.mypraticeproject.factorymethodpattern.factory.FactoryA;
import com.example.mypraticeproject.factorymethodpattern.product.Product;


public class Client {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.createProduct();
        product.create();
    }
}
