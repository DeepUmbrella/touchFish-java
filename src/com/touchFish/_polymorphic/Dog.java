package com.touchFish._polymorphic;

public class Dog extends Animal {
  private String needFood;

  public Dog(String name, String needFood) {
    super(name);
    this.needFood = needFood;
  }

  @Override
  String cal() {
    // TODO Auto-generated method stub
    return this.name;
  }

  @Override
  String isMyneedfood(String food) {
    if (this.needFood == food) {
      return "yes this is my needfood ! comefrom " + this.name;
    }
    return "no this not my needfood ! Master you need checkout one of food type to continue feed me!  comefrom "
        + this.name;
  }

}
