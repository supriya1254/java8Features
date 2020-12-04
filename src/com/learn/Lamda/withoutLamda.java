package com.learn.Lamda;

interface Display {
    public void bookName();
}

public class withoutLamda {
    public static void main(String[] args) {

        Display display = new Display() {
            @Override
            public void bookName() {
                System.out.println("Swami Vivekanand");
            }
        };

        Display display1 = () -> System.out.println("Harry Potter");

        display.bookName();
        display1.bookName();
    }
}
