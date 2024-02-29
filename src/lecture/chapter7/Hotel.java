package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

import java.io.Serializable;

public class Hotel implements Bookable, Comparable, Serializable {

  private int roomCount;
  private int bookedRoomCount;

  public Hotel(int roomCount) {
    this.roomCount = roomCount;
    this.bookedRoomCount = 0;
  }

  public void cleanRooms(){
    System.out.println("Und ich putz, putz, putz... *sing*");
  }

  @Override
  public boolean book(int slots) throws NotEnoughFreeSlotsException {
    if(slots > freeSlots()){
      // Ausnahme werfen
      NotEnoughFreeSlotsException e = new NotEnoughFreeSlotsException(slots, freeSlots());
      throw e;
    }

    bookedRoomCount += slots;
    return true;
  }

  @Override
  public int freeSlots() {
    return roomCount - bookedRoomCount;
  }

  @Override
  public int compareTo(Object o) {
    // TODO
    return 0;
  }
}
