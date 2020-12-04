package com.learn;

import java.util.Arrays;
import java.util.List;

public class streamAgeTest {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Charles", 10),
                new Employee("Dany", 40),
                new Employee("Cyara", 11),
                new Employee("Snaya", 30)
        );
        /*list.stream()
                .filter(predicate -> predicate.getAge()>30)
                .forEach(System.out::println);*/

        for (Employee employees:list ) {
            if(employees.getAge()>30)
            {
                System.out.println(employees);
            }
        }
    }
}
