package com.example.mypraticeproject.abstractfactorypattern;

import com.example.mypraticeproject.abstractfactorypattern.factory.AbstractFactory;
import com.example.mypraticeproject.abstractfactorypattern.factory.Factory1;
import com.example.mypraticeproject.abstractfactorypattern.factory.Factory2;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductA;
import com.example.mypraticeproject.abstractfactorypattern.product.ProductB;
import org.springframework.beans.factory.BeanFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.create();
        productB1.create();

        AbstractFactory factory2 = new Factory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.create();
        productB2.create();


    }
}
