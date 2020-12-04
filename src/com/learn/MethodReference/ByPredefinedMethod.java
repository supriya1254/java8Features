package com.learn.MethodReference;

import java.util.function.BiFunction;

class Addition{
    static int add(int a , int b)
    {
        return a+b;
    }
}

public class ByPredefinedMethod {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> added = Addition::add;
        System.out.println(added.apply(2,3));
    }
}
