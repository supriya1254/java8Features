package com.learn.OptionalClass;


import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        String[] stringArr = new String[5];
        stringArr[1] = "ram";

      //  System.out.println(stringArr[1]);

        Optional<String> s = Optional.ofNullable(stringArr[2]);
        System.out.println(s);
    }
}
