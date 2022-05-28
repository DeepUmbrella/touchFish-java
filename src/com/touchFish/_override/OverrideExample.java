package com.touchFish._override;

public class OverrideExample {
  public static void main(String[] args) {
    Person socialPerson = new Person();
    Student schoolStudent = new Student();

    schoolStudent.say(true);
    schoolStudent.say();
    socialPerson.say();
  }
}