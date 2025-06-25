package com.example.mypraticeproject.simplefactorypattern.simplefactory;

import com.example.mypraticeproject.simplefactorypattern.product.Product;

public class SimpleFactory {
    public static Product createProduct(String type) {
        if ("A".equalsIgnoreCase(type)) {
            return new com.example.mypraticeproject.simplefactorypattern.product.ProductA();
        } else if ("B".equalsIgnoreCase(type)) {
            return new com.example.mypraticeproject.simplefactorypattern.product.ProductB();
        } else {
            throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
