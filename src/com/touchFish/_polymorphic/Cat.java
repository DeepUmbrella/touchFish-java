package com.touchFish._polymorphic;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  public Cat() {
  }

  @Override
  String cal() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  String isMyneedfood(String food) {
    // TODO Auto-generated method stub
    return "i am cat and  all food 来者不拒";
  }

}
