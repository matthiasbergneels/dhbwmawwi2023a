package lecture.chapter6;

public class Bird extends Animal{

  private boolean canFly;

  public Bird(float weight, float size, String description, boolean canFly) {
    super(weight, size, description);
    this.canFly = canFly;
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  @Override
  public void breath(){
    System.out.println("Der Vogel " + getDescription() + " atmet!");
  }

  @Override
  public void eat(){
    System.out.println("Der Vogel " + getDescription() + " pickt Körner auf!");
  }


  @Override
  public String toString() {
    return "Bird{" +
      "canFly='" + canFly + "\', " +
      super.toString() +
      '}';
  }
}
