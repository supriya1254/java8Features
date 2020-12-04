package com.learn.Lamda;

interface Add{
    int twoNumber(int a, int b);

}
public class Addition {
    public static void main(String[] args) {
        Add add = new Add() {
            @Override
            public int twoNumber(int a, int b) {
                return a+b;
            }
        };
        Add add1 = (int a, int b) ->  a+b;
        System.out.println(add.twoNumber(10, 20));
        System.out.println(add1.twoNumber(30,40));
    }
}
