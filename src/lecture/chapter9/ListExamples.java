package lecture.chapter9;

import java.util.ArrayList;

public class ListExamples {

  public static void main(String[] args) {

    ArrayList vegetables = new ArrayList();

    // Todo:
    // - Tomaten sind Obst und müssen gelöscht werden
    // - Zucchini soll als zweites Gemüse hinzugefügt werden
    // - Paprika soll gegen Aubergine

    vegetables.add("Gurke");
    vegetables.add("Tomate");
    vegetables.add("Paprika");

    for(Object currentVegetable : vegetables){
      System.out.println(currentVegetable);
    }

  }
}
