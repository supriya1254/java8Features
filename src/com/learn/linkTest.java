package com.learn;

import java.util.HashMap;
import java.util.Map;

public class linkTest {

    public static void main(String[] args) {
        String templateString = "Hi {{customerName}}, you have successfully ordered a {{itemName}}.";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("customerName", "Bob");
        parameters.put("itemName", "sofa");

        String output = templateString;
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            output = output.replace("{{" + entry.getKey() + "}}", entry.getValue());
        }

        System.out.println(output);
    }
}
