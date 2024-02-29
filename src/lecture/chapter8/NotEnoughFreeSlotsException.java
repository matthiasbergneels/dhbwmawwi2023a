package lecture.chapter8;

public class NotEnoughFreeSlotsException extends Exception {

  public final int FREE_SLOTS_REMAINING;

  public NotEnoughFreeSlotsException(int slotsToBook, int freeSlots){
    super("Nicht genug freie Plätze - es wurde versucht "
          + slotsToBook + " zu buchen; freie Plätze: " + freeSlots);
    FREE_SLOTS_REMAINING = freeSlots;
  }
}
