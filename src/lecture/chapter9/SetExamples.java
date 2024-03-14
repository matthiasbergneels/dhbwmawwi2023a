package lecture.chapter9;

import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

  public static void main(String[] args) {

    Set<String> fruits = new TreeSet<>();

    fruits.add("Banane");
    fruits.add("Apfel");
    fruits.add("Avocado");
    fruits.add("Zitrone");
    fruits.add("Erdbeere");
    fruits.add("Apfel");
    fruits.add("Avocado");

    System.out.println("Erste Ausgabe der Menge:");
    for(String currentFruit : fruits){
      System.out.println(currentFruit);
    }

    fruits.remove("Erdbeere");

    System.out.println("Zweite Ausgabe der Menge:");
    for(String currentFruit : fruits){
      System.out.println(currentFruit);
    }


    Set<Student> students = new TreeSet<>();

    students.add(new Student(4711, "Fritz", "Mayer"));

    // Todo: fünf Stundents hinzufügen und lauffähig machen

    for(Student currentStudent : students){
      System.out.println(currentStudent);
    }
  }
}
