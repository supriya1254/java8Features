package com.learn.forEachMethod;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodWithStream {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Daina","Nihal","Sash", "Siri");

        name.stream()
                .filter(n -> n.startsWith("D"))
                .forEach(System.out::println);
    }
}
