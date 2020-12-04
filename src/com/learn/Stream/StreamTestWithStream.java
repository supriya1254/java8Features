package com.learn.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1 {
    int age;
    String name;
    float price;

    public Product1(int age, String name, float price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }
}

public class StreamTestWithStream {
    public static void main(String[] args) {
        List<Product1> products = new ArrayList<Product1>();
        products.add(new Product1(10, "kanha", 2000.0f));
        products.add(new Product1(20, "Nishchal", 3000.0f));
        products.add(new Product1(30, "Shubh", 4000.0f));

        List<Float> productPriceList = products.stream()
                .filter(product -> product.price>2000)
                .map(product -> product.price)
                .collect(Collectors.toList());
        System.out.println(productPriceList);

        System.out.println("print list of price : " + productPriceList);
    }
}
