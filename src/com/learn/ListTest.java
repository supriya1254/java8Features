package com.learn;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListTest
{
    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("Charles", "Jam"),
                new User("Dany", "Moryas"),
                new User("Cyara", "Henry"),
                new User("Snaya", "kinlay")
        );

        //we need to sort the list
                             //( o1,  o2) -> o1.getFirstname().compareTo(o2.getFirstname()));
        Collections.sort(list, Comparator.comparing(User::getFirstname));
       System.out.println("Print the sorted List :  " + list);

       //Print All the element from List

        printConditionally(list, u -> true, user -> System.out.println(user));

        //print the first name with beginning with 'C'
        printConditionally(list, user -> user.getFirstname().startsWith("C"),
                user -> System.out.println("first name with beginning with 'C'" + user));



        //print the last name with beginning with 'H'
        printConditionally(list, user -> user.getLastname().startsWith("H"),
                user -> System.out.println("last name with beginning with 'H'" +user));


    }

    private static void printConditionally(List<User> list, Predicate<User> predicate, Consumer<User> consumer) {
        for (User user: list) {
            if(predicate.test(user)){
                consumer.accept(user);
            }

        }
    }
}
