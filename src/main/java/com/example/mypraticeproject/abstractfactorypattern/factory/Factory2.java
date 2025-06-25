package com.example.mypraticeproject.abstractfactorypattern.factory;

import com.example.mypraticeproject.abstractfactorypattern.product.ProductA;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductA2;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductB;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductB2;

public class Factory2 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
