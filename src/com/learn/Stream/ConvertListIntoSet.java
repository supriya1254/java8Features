package com.learn.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListIntoSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 60, 40, 40, 10);

        //print complete list
       /* numbers.stream()
                .forEach(num -> System.out.println(num));*/

        //covert this list into set
        Set<Integer> nm = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(nm);
    }
}
