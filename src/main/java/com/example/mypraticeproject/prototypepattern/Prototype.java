package com.example.mypraticeproject.prototypepattern;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Setter
@Getter
public class Prototype implements Cloneable{
    private String name;
    private List<String> items;

    public Prototype(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public Prototype clone() {
        try {
            // 调用 super.clone() 进行浅拷贝
            Prototype cloned = (Prototype) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    public static void main(String[] args) {
        List items = new ArrayList();
        items.add("Item1");
        items.add("Item2");
        Prototype original = new Prototype("Original", items);
        Prototype cloned = original.clone();

        // 修改克隆对象的属性
        cloned.setName("Cloned");
        cloned.getItems().add("Item3");

        // 输出原始对象和克隆对象的属性
        System.out.println(original.getName() + original.getItems());
        System.out.println(cloned.getName() + cloned.getItems());
    }

}
