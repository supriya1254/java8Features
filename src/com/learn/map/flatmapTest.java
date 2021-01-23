package com.learn.map;

import java.util.List;
import java.util.stream.Collectors;

public class flatmapTest {
    public static void main(String[] args) {
        EkartDatabase ekartDatabase = new EkartDatabase();
        List<Customer> customerList = ekartDatabase.getAllCustomer();

        //mapping is one-to-many ---> one customer have list of phoneNumbers-----> Data flattering.

        //if we use map () method here also to get the phone number it wil return List<List<T>,
        // but we need List<String>
        List<List<String>> phoneNumbers1 = customerList.stream()
                .map(Customer::getPhoneNumber)
                .collect(Collectors.toList());
        System.out.println("print list of phoneNumbers with map() method : : " + phoneNumbers1);

        //this will return List<String>
        List<String> phoneNumbers = customerList.stream()
                .flatMap(customer -> customer.getPhoneNumber().stream())
                .collect(Collectors.toList());
        System.out.println("print list of phoneNumbers with flatmap() method : : " + phoneNumbers);
    }
}
