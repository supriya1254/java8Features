package com.learn.Stream;

import java.util.ArrayList;
import java.util.List;

class Product {
    int age;
    String name;
    float price;

    public Product(int age, String name, float price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }
}
public class StreamTestWithoutStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(10, "kanha", 2000.0f));
        products.add(new Product(20, "Nishchal", 3000.0f));
        products.add(new Product(30, "Shubh", 4000.0f));

        List<Float> productPriceList = new ArrayList<Float>();

        for (Product product : products)
        {
            if(product.price>2000)
            {
                productPriceList.add(product.price);
            }
        }

        System.out.println("print list of price : " + productPriceList);
    }
}
