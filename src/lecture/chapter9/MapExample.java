package lecture.chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

  public static void main(String[] args) {
    Map<Integer, Student> studentMap = new HashMap<>();

    Student s1 = new Student(4711, "Klaus", "Müller");
    studentMap.put(s1.getId(), s1);
    studentMap.put(Integer.valueOf(8921), new Student(8921, "Gabi", "Heinrich"));
    studentMap.put(Integer.valueOf(1782), new Student(1782, "Michaela", "Neumeier"));
    // Auto-Boxing --> int -> Integer
    studentMap.put(8920, new Student(8920, "Gottlieb", "Zeus"));

    System.out.println(studentMap.get(Integer.valueOf(1782)));

    Set<Integer> studentKey = studentMap.keySet();

    for(int key : studentKey){
      System.out.println(key + " - " + studentMap.get(key));
    }
  }
}
