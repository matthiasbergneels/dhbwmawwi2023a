package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public interface Bookable {

  boolean book(int slots) throws NotEnoughFreeSlotsException;
  int freeSlots();
  default boolean reserve(int slots){
    return false;
  };
}
