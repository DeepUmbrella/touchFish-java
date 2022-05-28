package com.touchFish._polymorphic;

public class Food {
  private String foodname;

  public Food(String name) {
    this.foodname = name;
  }

  public Food() {
    this.foodname = "unkonw food";
  }

  public String callFoodname() {
    return this.foodname;
  }

  public String getFoodname() {
    return foodname;
  }

  public void setFoodname(String foodname) {
    this.foodname = foodname;
  }

}
