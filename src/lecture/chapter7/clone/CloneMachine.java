package lecture.chapter7.clone;

public class CloneMachine {

  public static void main(String[] args) throws CloneNotSupportedException {

    Sheep dolly1 = new Sheep("Dolly", 5);

    Sheep dolly2 = dolly1.clone();

    System.out.println(dolly1);
    System.out.println(dolly2);
  }
}
