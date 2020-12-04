package com.learn;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.stream.IntStream;

public class Basics {
    public static void main(String[] args) {
/*        IntStream.range(1,20)
                .forEach(System.out ::println);*/
       // System.out.println();


        Date currentDate = new Date ();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY");
        String date = dateFormat.format(currentDate);
        System.out.println(date);

        System.out.println("Instant now : " + Instant.now());

    }
}
