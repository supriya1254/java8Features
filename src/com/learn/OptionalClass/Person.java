package com.learn.OptionalClass;

import java.util.Optional;

public class Person {

  private String name;
  private String email;

  Person(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Optional<String> getEmail() {
    return Optional.ofNullable(email);
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
