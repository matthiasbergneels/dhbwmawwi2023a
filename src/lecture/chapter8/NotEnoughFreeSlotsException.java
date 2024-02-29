package lecture.chapter8;

public class NotEnoughFreeSlotsException extends Exception {

  public NotEnoughFreeSlotsException(){
    super("Nicht genug freie Plätze!");
  }
}
