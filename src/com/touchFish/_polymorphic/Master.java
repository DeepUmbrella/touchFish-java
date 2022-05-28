package com.touchFish._polymorphic;

public class Master {
  private String mastername;

  public Master(String mastername) {
    this.mastername = mastername;
  }

  public String feedAnimal(Animal animal, Food food) {
    return this.mastername + "  feed a : " + animal.name + ",\n " + animal.name + ": "
        + animal.isMyneedfood(food.getFoodname());
  }
}
