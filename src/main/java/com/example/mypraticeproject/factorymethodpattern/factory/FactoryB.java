package com.example.mypraticeproject.factorymethodpattern.factory;

import com.example.mypraticeproject.factorymethodpattern.product.Product;
import com.example.mypraticeproject.factorymethodpattern.product.ProductB;

public class FactoryB extends Factory {

    @Override
    public Product createProduct() {
        // Here you would typically create and return an instance of ProductB
        // For demonstration, we will just return null
        return new ProductB(); // Replace with actual ProductB instantiation when available
    }
}
