package lecture.chapter8;

public class NotEnoughFreeSlotsException extends Exception {

  /*
  Aufgaben zur Erweiterung:
  1. NotEnoughFreeSlotsException in Airplane.book() einbauen und auslösen
  2. Meldung aus NotEnoughFreeSlotsException um die Anzahl der freiePlätze und versuchten gebuchten Plätze erweitern
  3. catch-Block in Travel Agency: verbleibende freie Plätze buchen
   */
  
  public NotEnoughFreeSlotsException(){
    super("Nicht genug freie Plätze!");
  }
}
