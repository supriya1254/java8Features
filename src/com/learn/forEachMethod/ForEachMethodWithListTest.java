package com.learn.forEachMethod;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodWithListTest {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            myList.add(i);
        }
       // System.out.println(myList);

        //traversing through the Iterator interface

        Iterator<Integer> it = myList.iterator();
        //we need to iterate
        while(it.hasNext())
        {
            Integer i =it.next();
       //     System.out.println("print i : : : "+ i);
        }
       // System.out.println("print it : " + it);

        //traversing through forEach method with anonymous class

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
              //  System.out.println("print value : : " + value);
            }
        });

        //print the complete list
        myList.forEach(System.out::println);

    }
}
