package lecture.chapter12;

public class LinkedListRun {

  public static void main(String[] args) {
    LinkedList numberList = new LinkedList();

    numberList.add(100);
    numberList.add(50);
    numberList.add(80);
    numberList.add(45);
    numberList.add(10);

    System.out.println("Anzahl Elemente: " + numberList.size());
    numberList.printList();
    numberList.remove(80);

    System.out.println("Anzahl Elemente: " + numberList.size());
    numberList.printList();
  }
}
