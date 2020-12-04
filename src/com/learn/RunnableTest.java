package com.learn;

public class RunnableTest
{
    public static void main(String[] args) {
        //without lamda
        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Thread 1 is running!");
            }
        });

        //with Lamda expression
        Thread t2 = new Thread(() -> System.out.println("Thread 2 is running!"));
        t2.run();
    }
}
