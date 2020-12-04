package com.learn;

import java.util.Arrays;
import java.util.List;

public class StreamsTest {
    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("Charles", "Jam"),
                new User("Dany", "Moryas"),
                new User("Cyara", "Henry"),
                new User("Snaya", "kinlay")
        );
        list.stream()
                .filter(predicate -> predicate.getFirstname().startsWith("C"))
                .forEach(System.out::println);
    }

}

//Pending
//https://www.youtube.com/watch?v=bTTNVP_ORr8