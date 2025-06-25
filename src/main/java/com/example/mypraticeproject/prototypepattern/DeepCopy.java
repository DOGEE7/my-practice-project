package com.example.mypraticeproject.prototypepattern;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class DeepCopy implements Cloneable {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    private String name;
    private List<String> items;

    public DeepCopy(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public DeepCopy clone() {
        try {
            // 调用 super.clone() 进行浅拷贝
            DeepCopy cloned = (DeepCopy) super.clone();
            // 深拷贝 items 列表
            cloned.items = new ArrayList<>(this.items);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");
        DeepCopy original = new DeepCopy("Original", items);
        DeepCopy cloned = original.clone();

        // 修改克隆对象的属性
        cloned.setName("Cloned");
        cloned.getItems().add("Item3");

        // 输出原始对象和克隆对象的属性
        System.out.println("Original: " + original.getName() + ", Items: " + original.getItems());
        System.out.println("Cloned: " + cloned.getName() + ", Items: " + cloned.getItems());
    }
}
