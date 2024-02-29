package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class Airplane implements Bookable{

  private boolean[] seats;  // false -> frei; true -> gebucht

  public Airplane(int seatCount){
    seats = new boolean[seatCount];
  }

  public void flight(){
    System.out.println("und ich flieg, flieg, flieg... *sing*");
  }

  @Override
  public boolean book(int slots) throws NotEnoughFreeSlotsException{
    if(slots > freeSlots()) {
      throw new NotEnoughFreeSlotsException(slots, freeSlots());
    }

      for(int i = 0; i < seats.length; i++){
        if(slots > 0 && !seats[i]){
          seats[i] = true;
          slots--;
        }
      }
      return true;
  }

  @Override
  public int freeSlots() {
    int freeSlots = 0;
    for(boolean currentSeat : seats){
      if(!currentSeat){
        freeSlots++;
      }
    }
    return freeSlots;
  }
}
