package com.learn.Stream;

import java.util.*;
import java.util.stream.Collectors;

class Home {

    int price;
    String name;

    Home(int price, String name)
    {
        this.price = price;
        this.name = name;
    }
}

public class ConvertListIntoMap {
    public static void main(String[] args) {
        List<Home> numbers = new ArrayList<>();
        numbers.add(new Home(1000, "Anikta"));
        numbers.add(new Home(2000, "Sona"));


        //print complete list
       /* numbers.stream()
                .forEach(num -> System.out.println(num));*/

        //covert this list into map
        Map<Integer, String> nm = numbers.stream()
                .collect(Collectors.toMap(num -> num.price, num->num.name));

        System.out.println(nm);
    }
}
