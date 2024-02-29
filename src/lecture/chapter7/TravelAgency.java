package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

public class TravelAgency {

  public static void main(String[] args) {

    Bookable[] bookableObjects = new Bookable[5];

    // Narrowing Cast
    bookableObjects[0] = new Hotel(150);
    bookableObjects[1] = new Airplane(120);
    bookableObjects[2] = new Hotel(250);
    bookableObjects[4] = new Airplane(800);

    Hotel myHotel = new Hotel(50);
    System.out.println("Hotel ist Buchbar? " + (myHotel instanceof Bookable));

    for(Bookable currentBookableObject : bookableObjects){

      if(currentBookableObject instanceof Hotel currentHotel){
        // Hotel myNewHotel = currentBookableObject; --> EXPLIZITER CAST NOTWENDIG
        currentHotel.cleanRooms();
      }

      try {
        System.out.println("Freie Plätzte: " + currentBookableObject.freeSlots());
        currentBookableObject.book(200);
        System.out.println("Verbleibende freie Plätzte: " + currentBookableObject.freeSlots());
      }catch(NotEnoughFreeSlotsException e){
        System.out.println("Problem beim buchen:");
        System.out.println(e.getMessage());

        try {
          currentBookableObject.book(e.FREE_SLOTS_REMAINING);
        } catch(NotEnoughFreeSlotsException e1){
          System.out.println("Buchen hat keinen Sinn!!!!! :-( ");
        }
      }catch(NullPointerException e){
        System.out.println("Kein Buchbares Objekt hinterlegt - hat alles keinen Sinn!");
        System.out.println(e.getMessage());
        //return;
      }catch(Exception e){
        // Catch-All --> trifft auf alle Exception Klassen zu
        System.out.println("Ich fang alles :P");
        System.out.println(e.getMessage());
      }finally{
        System.out.println("Hier wird aufgeräumt!!");
      }
    }

    System.out.println("Urlaub ist gebucht!!");
  }
}
