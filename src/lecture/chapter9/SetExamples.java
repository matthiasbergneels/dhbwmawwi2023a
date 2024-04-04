package lecture.chapter9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

  public static void main(String[] args) {

    Set<String> fruits = new HashSet<>();

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
    students.add(new Student(8921, "Gabi", "Heinrich"));
    students.add(new Student(1782, "Michaela", "Neumeier"));
    students.add(new Student(8920, "Gottlieb", "Zeus"));
    students.add(new Student(4711, "Moritz", "Müller"));

    for(Student currentStudent : students){
      System.out.println(currentStudent);
    }

    Student student1 = new Student(4711, "Fritz", "Mayer");
    Student student2 = new Student(4711, "Fritz", "Mayer");
    Student student3 = new Student(8928, "Gabi", "Mueller");
    Student student4 = student1;

    System.out.println("s1 compareTo s2: " + student1.compareTo(student2));
    System.out.println("s1 compareTo s3: " + student1.compareTo(student3));
    System.out.println("s1 compareTo s4: " + student1.compareTo(student4));

    System.out.println("s1 equals s2: " + student1.equals(student2));
    System.out.println("s1 equals s3: " + student1.equals(student3));
    System.out.println("s1 equals s4: " + student1.equals(student4));

    System.out.println("s1.hashCode(): " + student1.hashCode());
    System.out.println("s2.hashCode(): " + student2.hashCode());
    System.out.println("s3.hashCode(): " + student3.hashCode());
    System.out.println("s4.hashCode(): " + student4.hashCode());



  }
}
