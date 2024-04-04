package lecture.chapter9;

import lecture.chapter5.CAR_BRAND;
import lecture.chapter5.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ListExamples {

  public static void main(String[] args) {

    List<String> vegetables = new Vector<String>();

    vegetables.add("Gurke");
    vegetables.add("Pilz");
    vegetables.add("Erbsen");
    vegetables.add("Paprika");
    vegetables.add("Tomate");
    vegetables.add("Paprika");
    vegetables.add("Tomate");
    vegetables.add("Pilz");
    vegetables.add("Tomate");
    vegetables.add("Pilz");
    vegetables.add("Tomate");
    //vegetables.add(new Car("pink", 300, CAR_BRAND.SMART, "Gas"));

    System.out.println("Erste Ausgabe der Liste:");
    for(Object currentVegetable : vegetables){
      System.out.println(currentVegetable);
    }

    // Todo:
    // - Tomaten sind Obst und müssen gelöscht werden
    List toDelete = new ArrayList();
    toDelete.add("Tomate");
    vegetables.removeAll(toDelete);

    while(vegetables.contains("Tomate")){
      System.out.println("Böse Obst Tomate wird gelöscht!");
      vegetables.remove("Tomate");
    }

    // - Zucchini soll als zweites Gemüse hinzugefügt werden
    vegetables.add(1, "Zucchini");

    // - Paprika soll gegen Aubergine ersetzt werden
    while(vegetables.contains("Paprika")) {
      vegetables.set(vegetables.indexOf("Paprika"), "Aubergine");
    }


    System.out.println("Zweite Ausgabe der Liste:");
    for(String currentVegetable : vegetables){
      System.out.println(currentVegetable);
    }

    // Pilze Löschen
    /* --> funktioniert nicht: java.util.ConcurrentModificationException
    for(String currentVegetable : vegetables){
      if(currentVegetable.equals("Pilz")){
        vegetables.remove(currentVegetable);
      }
    }
     */

    Iterator<String> vegetablesIterator = vegetables.iterator();
    while(vegetablesIterator.hasNext()){
      String currentVegetable = vegetablesIterator.next();
      if(currentVegetable.equals("Pilz")){
        vegetablesIterator.remove();
        //vegetables.remove(currentVegetable);  --> funktioniert nicht: java.util.ConcurrentModificationException
      }
    }

    for(int i = 0; i < vegetables.size(); i++){
      if(vegetables.get(i).equals("Aubergine")){
        // vegetables.remove(i); --> Führt zu Inkonsistenzen
      }
    }

    System.out.println("Dritte Ausgabe der Liste:");
    for(String currentVegetable : vegetables){
      System.out.println(currentVegetable);
    }

    vegetables = vegetables.stream()
                .filter(s -> !s.equals("Aubergine"))
                .collect(Collectors.toList());

    System.out.println("Vierte Ausgabe der Liste:");
    for(String currentVegetable : vegetables){
      System.out.println(currentVegetable);
    }

  }
}
