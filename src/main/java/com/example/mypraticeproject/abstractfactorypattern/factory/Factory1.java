package com.example.mypraticeproject.abstractfactorypattern.factory;

import com.example.mypraticeproject.abstractfactorypattern.product.ProductA;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductA1;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductB;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductB1;

public class Factory1 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
