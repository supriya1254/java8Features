package com.learn.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

    public List<Customer> getAllCustomer() {
        return Stream.of(
                new Customer(101,"supriya","supriya@gmail.com", Arrays.asList("1111","222324")),
                new Customer(102,"surbhi","surbhi@gmail.com", Arrays.asList("3435345","24235356")),
                new Customer(103,"sweta","sweta@gmail.com", Arrays.asList("768779","34764909"))
        ).collect(Collectors.toList());
    }
}
