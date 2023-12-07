package lecture.chapter6;

public final class Dog extends Animal{

  private String breed;

  public Dog(float weight, float size, String description, String breed) {
    super(weight, size, description);
    this.breed = breed;
  }

  public void bark(){
    System.out.println("Der Hund " + getDescription() + " bellt! *wuff*");
  }

  @Override
  public void eat(){
    super.eat();
    System.out.println("frisst Fleisch!");
  }

  public void eat(float amount){
    System.out.println("Der Hund " + getDescription() + " frisst " + amount + " g Fleisch!");
  }

  @Override
  public void breath(){
    System.out.println("Der Hund " + getDescription() + " atmet!");
  }

  /* --> nicht für final Methoden möglich
  @Override
  public void move(){

  }
   */

  @Override
  public String toString() {
    return "Dog{" +
      "breed='" + breed + "\', " +
      super.toString() +
      '}';
  }
}
