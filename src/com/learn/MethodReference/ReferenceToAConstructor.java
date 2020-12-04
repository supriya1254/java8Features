package com.learn.MethodReference;

interface Testt {
    public void calculateNum();
}

class Message {
    Message() {
        System.out.println("Hello new!!");
    }
}

public class ReferenceToAConstructor {
    public static void main(String[] args) {
        Testt tt = Message::new;
        tt.calculateNum();
    }
}
