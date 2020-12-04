package com.learn.MethodReference;

interface Test {
    String show();
}

class UseMe {
    public static String Hello() {
        return "hello" ;
    }
}

public class MethodRefWithStaticMethod {
    public static void main(String[] args) {
        Test t = UseMe::Hello;
        System.out.println(t.show());
    }
}
