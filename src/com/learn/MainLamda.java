package com.learn;

public class MainLamda {

    interface StringLenght
    {
            int lengthOfString(String s);
    }

    public static void main(String[] args) {

        MainLamda m = new MainLamda();

        StringLenght len = (String s) -> s.length();
        System.out.println(len.lengthOfString("Supriya"));

    }
}
