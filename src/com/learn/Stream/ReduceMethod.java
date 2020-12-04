package com.learn.Stream;

import java.util.ArrayList;
import java.util.List;

class Item {
    int age;
    String name;
    float price;

    public Item(int age, String name, float price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }
}
public class ReduceMethod {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(10, "kanha", 2000.0f));
        items.add(new Item(20, "Nishchal", 3000.0f));
        items.add(new Item(30, "Shubh", 4000.0f));

        List<Float> itemPriceList = new ArrayList<Float>();

        for (Item item : items)
        {
            if(item.price>2000)
            {
                itemPriceList.add(item.price);
            }
        }

        System.out.println("print list of price : " + itemPriceList);
    }
}
