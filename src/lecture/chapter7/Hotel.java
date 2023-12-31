package lecture.chapter7;

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
  public boolean book(int slots) {
    if(slots <= freeSlots()){
      bookedRoomCount += slots;
      return true;
    }
    return false;
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
