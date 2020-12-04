package com.learn.Lamda;

import java.util.Arrays;
import java.util.List;

public class LamdaForEach {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(2,5,7,8);
        for (Integer a:arr) {
            System.out.println(a);
        }

        arr.forEach(
                (n)-> System.out.println("with lamda" + n)
        );
    }
}
