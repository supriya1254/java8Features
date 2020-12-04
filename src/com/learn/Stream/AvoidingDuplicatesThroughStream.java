package com.learn.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AvoidingDuplicatesThroughStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,60,40,40,10);
        numbers.stream()
                .distinct()
                .forEach(num -> System.out.println(num));

    }
}
