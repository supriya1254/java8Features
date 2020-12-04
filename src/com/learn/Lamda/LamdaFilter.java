package com.learn.Lamda;

import java.util.ArrayList;
import java.util.List;

class Product
{
    String name;
    int age;

    Product(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}

public class LamdaFilter {
    public static void main(String[] args) {
    List<Product> productList = new ArrayList<Product>();
    productList.add((new Product("supriya", 30)));
    productList.add((new Product("akku", 31)));
    productList.add((new Product("abhishek", 28)));

   // productList.forEach((n)->System.out.println(n.name + " , " + n.age));

    productList.stream()
            .filter(n -> n.age>30)
            .forEach((n)->System.out.println(n.name + "," + n.age));
    }
}
