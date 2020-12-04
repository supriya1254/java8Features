package com.learn.MethodReference;

interface Test1 {
    void display();
}

class ShowMe {
    void HomeDecor() {
        System.out.println("Blue Color house!");
    }
}

public class MethodRefWithInstanceMethod {
    public static void main(String[] args) {
        ShowMe me = new ShowMe();
        Test1 t1 = me::HomeDecor; //by reference

        //calling interface
        t1.display();

        // Referring non-static method using anonymous object
        Test1 t2 = new ShowMe()::HomeDecor;
        t2.display();
    }
}
