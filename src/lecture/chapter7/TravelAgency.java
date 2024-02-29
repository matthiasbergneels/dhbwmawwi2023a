package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class TravelAgency {

  public static void main(String[] args) {

    Bookable[] bookableObjects = new Bookable[4];

    // Narrowing Cast
    bookableObjects[0] = new Hotel(100);
    bookableObjects[1] = new Airplane(100);
    bookableObjects[2] = new Hotel(250);
    bookableObjects[3] = new Airplane(800);

    Hotel myHotel = new Hotel(50);
    System.out.println("Hotel ist Buchbar? " + (myHotel instanceof Bookable));

    for(Bookable currentBookableObject : bookableObjects){

      if(currentBookableObject instanceof Hotel currentHotel){
        // Hotel myNewHotel = currentBookableObject; --> EXPLIZITER CAST NOTWENDIG
        currentHotel.cleanRooms();
      }

      try {
        System.out.println("Freie Plätzte: " + currentBookableObject.freeSlots());
        boolean bookingSuccessfull = currentBookableObject.book(100);
        System.out.println("Buchung erfolgreich: " + bookingSuccessfull);
        bookingSuccessfull = currentBookableObject.book(100);
        System.out.println("Buchung erfolgreich: " + bookingSuccessfull);
        System.out.println("Verbleibende freie Plätzte: " + currentBookableObject.freeSlots());
      }catch(NotEnoughFreeSlotsException e){
        System.out.println("Problem beim buchen:");
        System.out.println(e.getMessage());
      }

    }


  }
}
