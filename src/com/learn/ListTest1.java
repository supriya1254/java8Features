package com.learn;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListTest1
{
    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("Charles", "Jam"),
                new User("Dany", "Moryas"),
                new User("Cyara", "Henry"),
                new User("Snaya", "kinlay")
        );
       // List<String> fn = new ArrayList();

        /*for(User user : list)
        {
            if(user.getFirstname().equals("Charles"))
            {
                fn.add(user.getFirstname());
            }
        }*/
        List<User> fn = list.stream().filter(user -> user.getFirstname().equals("Charles"))
                .collect(Collectors.toList());
        fn.stream().forEach(System.out::println);
    }
}
