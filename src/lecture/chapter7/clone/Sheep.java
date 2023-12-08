package lecture.chapter7.clone;

public class Sheep implements Cloneable{
  private String name;
  private int age;

  public Sheep(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  protected Sheep clone() throws CloneNotSupportedException {
    Sheep clonedSheep = (Sheep)super.clone();
    clonedSheep.age = 0;

    return clonedSheep;
  }

  @Override
  public String toString() {
    return "Sheep{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}
