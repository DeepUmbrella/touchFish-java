package com.touchFish._Super;

public class Computer {
  private String Mechinetype = "";

  private String memory = "";

  public Computer() {
    this.Mechinetype = "baseconfig";
    this.memory = "12GB";
  }

  public String getMechinetype() {
    return Mechinetype;
  }

  public String getMemory() {
    return memory;
  }
}
