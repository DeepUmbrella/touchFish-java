package com.touchFish._override;

public class Student extends Person {
  private int id;
  private double score;

  public Student() {
    this.id = 0;
    this.score = 0.0;
  }

  public Student(int id, double score) {
    this.id = id;
    this.score = score;
  }

  public Student(String introudce, String name, int id, double score) {
    super(introudce, name);
    this.id = id;
    this.score = score;
  }

  @Override
  public String say() {
    System.out.println("Student.say()");
    return super.say() + "id = " + this.id + "score = " + this.score;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

}
