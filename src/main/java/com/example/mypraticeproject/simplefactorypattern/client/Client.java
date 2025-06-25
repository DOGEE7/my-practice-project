package com.example.mypraticeproject.simplefactorypattern.client;

import com.example.mypraticeproject.simplefactorypattern.product.Product;
import com.example.mypraticeproject.simplefactorypattern.simplefactory.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        product.create(); // 输出: ProductA created.
    }
}
