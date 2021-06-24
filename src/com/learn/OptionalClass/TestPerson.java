package com.learn.OptionalClass;

public class TestPerson {
  public static void main(String[] args) {

    Person person = new Person("supriya", "SUPRIYA@GMAIL.COM");

    String email = person
      .getEmail()
      .map(String::toLowerCase)
      .orElse("email not provided");

    System.out.println(email);

  }

}
