package com.touchFish._polymorphic;

public class Poly {
  public static void main(String[] args) {
    Master master = new Master("lisa");
    Animal dog = new Dog("tom", "bone");
    Animal cat = new Cat();
    Food bone = new Food("goushi");

    System.out.println(master.feedAnimal(dog, bone));
    System.out.println(master.feedAnimal(cat, bone));
  }
}