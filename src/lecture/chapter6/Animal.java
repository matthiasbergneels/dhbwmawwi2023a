package lecture.chapter6;

public abstract class Animal {

  private float weight;
  private float size;
  private String description;

  public Animal(float weight, float size, String description) {
    this.weight = weight;
    this.size = size;
    this.description = description;
  }

  public final void move(){
    System.out.println("Das Tier " + description + " bewegt sich");
  }

  public void eat(){
    System.out.println("Das Tier " + description + " frisst");
  }

  public abstract void breath();

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public float getSize() {
    return size;
  }

  public void setSize(float size) {
    this.size = size;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Animal{" +
      "weight=" + weight +
      ", size=" + size +
      ", description='" + description + '\'' +
      '}';
  }
}
