package com.touchFish._override;

public class Person {
  private String introudce;
  private String name;

  public Person() {
    this.introudce = "this gays do not write nothing!";
    this.name = "noNameUser";
  }

  public Person(String introudce, String name) {
    this.introudce = introudce;
    this.name = name;
  }

  public String say() {
    return "my name is :" + this.name + "," + this.introudce;
  }

  public String say(Boolean islog) {
    System.out.println("my name is :" + this.name + "," + this.introudce);
    return "my name is :" + this.name + "," + this.introudce;

  }

}
