package com.example.mypraticeproject.factorymethodpattern.factory;

import com.example.mypraticeproject.factorymethodpattern.product.Product;
import com.example.mypraticeproject.factorymethodpattern.product.ProductA;

public class FactoryA extends Factory{

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
