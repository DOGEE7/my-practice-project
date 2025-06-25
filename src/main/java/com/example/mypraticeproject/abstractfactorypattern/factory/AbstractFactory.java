package com.example.mypraticeproject.abstractfactorypattern.factory;

import com.example.mypraticeproject.abstractfactorypattern.product.ProductA;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductB;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
