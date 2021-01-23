package com.learn.map;

import java.util.List;
import java.util.stream.Collectors;

public class mapTest {
    public static void main(String[] args) {
        EkartDatabase ekartDatabase = new EkartDatabase();
        List<Customer> customerList = ekartDatabase.getAllCustomer();

        //with this snippet of code List<Customer> will convert List<String>
        // one customer has one email id.
        // -----> Data transformation
        List<String> emails = customerList.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
      //  System.out.println("print list of emails: " + emails);


        //with this snippet of code List<Customer> will convert List<String>
        // but mapping is one-to-many ---> one customer have list of phoneNumbers.
        // -----> Data flattering.

        //if we use map () method to get the phone number it wil return List<List<T>, but we need List<String>
        List<List<String>> phoneNumbers1 = customerList.stream()
                .map(Customer::getPhoneNumber)
                .collect(Collectors.toList());
        System.out.println("print list of phoneNumbers with map() method : : " + phoneNumbers1);

       List<String> phoneNumbers = customerList.stream()
                .flatMap(customer -> customer.getPhoneNumber().stream())
                .collect(Collectors.toList());
        System.out.println("print list of phoneNumbers with flatmap() method : : " + phoneNumbers);
    }
}
