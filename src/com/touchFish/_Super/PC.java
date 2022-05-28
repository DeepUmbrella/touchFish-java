package com.touchFish._Super;

public class PC extends Computer {
  String disk = "SSD 512GB";

  public PC() {
    super();
    this.disk = "basedisk";
  }

  public String getDisk() {
    return disk;
  }
}
