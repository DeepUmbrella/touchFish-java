package com.touchFish._polymorphic;

abstract class Animal {
  protected String name;
  protected String needFood;

  public Animal(String name, String needFood) {
    this.name = name;
    this.needFood = needFood;
  }

  public Animal(String name) {
    this.name = name;
    this.needFood = "all";
  }

  public Animal() {
    this.name = "未知动物,目前还不知道吃什么！";
    this.needFood = "unkown";
  }

  abstract String cal();

  abstract String isMyneedfood(String food);
}
