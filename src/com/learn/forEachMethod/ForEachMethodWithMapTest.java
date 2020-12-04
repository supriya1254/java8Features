package com.learn.forEachMethod;

import java.util.*;
import java.util.function.Consumer;

public class ForEachMethodWithMapTest {
    public static void main(String[] args) {

        Map<Integer, Integer> myMap = new HashMap<>();

        myMap.put(1,101);
        myMap.put(2,202);
        myMap.put(3,303);

        myMap.forEach((k,v) -> System.out.println(" print key and value  : " + k + " , " + v));

        myMap.forEach((k,v) ->
        {
            int addK = k+10;

            System.out.println(" updated print key and value  : " + addK + " , " + v);
        });
    }
}
