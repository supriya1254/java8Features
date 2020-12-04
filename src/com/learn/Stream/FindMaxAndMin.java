package com.learn.Stream;

import java.util.ArrayList;
import java.util.List;

class Item1 {
    int age;
    String name;
    float price;

    public Item1(int age, String name, float price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }
}
public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Item1> items = new ArrayList<Item1>();
        items.add(new Item1(10, "kanha", 2000.0f));
        items.add(new Item1(20, "Nishchal", 3000.0f));
        items.add(new Item1(30, "Shubh", 4000.0f));

        Item1 item1 = items.stream()
                .max((o1, o2) -> o1.age > o2.age ? 1 : -1)
                .get();

        System.out.println("max age" + item1.age);

        Item1 item11 = items.stream()
                .min((o1, o2) -> o1.age < o2.age ? -1 : 1)
                .get();
        System.out.println("min age" + item11.age);
    }
}
