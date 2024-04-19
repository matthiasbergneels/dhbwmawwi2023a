package lecture.chapter12;

public class LinkedList {

  private Node head;
  private Node tale;
  private int size;

  public void add(int data){
    Node newNode = new Node(data);
    size++;

    if(head == null){
      head = newNode;
      return;
    }

    Node currentNode = head;
    while(currentNode.getNextNode() != null){
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
  }

  // TODO:
  // 1. einfache Ausgabe der gesamten Liste
  public void printList(){
    Node currentNode = head;

    while(currentNode != null){
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNextNode();
    }
    System.out.println();
  }

  public void printListRecursive(){
    if(head == null){
      System.out.println("Liste ist leer");
      return;
    }

    printListRecursive(head);
    System.out.println();
  }

  private void printListRecursive(Node currentNode){
    System.out.print(currentNode.getData() + " ");
    if(currentNode.getNextNode() != null){
      printListRecursive(currentNode.getNextNode());
    }
  }


  // 2. Löschen eines Knotens anhand des Datenwertes (bei mehreren wird der erste gefundene Knoten gelöscht)
  boolean remove(int data){
    if(head != null){

      if(head.getData() == data){
        head = head.getNextNode();
        size--;
        return true;
      }

      Node currentNode = head;
      while(currentNode.getNextNode() != null){
        if(currentNode.getNextNode().getData() == data){
          currentNode.setNextNode(currentNode.getNextNode().getNextNode());
          size--;
          return true;
        }
        currentNode = currentNode.getNextNode();
      }

    }
    return false;
  }

  // 3. implementieren der Methode size() --> Ausgabe wie viele elemente es gibt
  public int size(){
    return this.size;
  }

  public int sizeCalculated(){
    Node currentNode = head;
    int size = 0;

    while(currentNode != null){
      size++;
      currentNode = currentNode.getNextNode();
    }

    return size;
  }

  private class Node{
    private int data;
    private Node nextNode;

    Node(int data){
      this.data = data;
      this.nextNode = null;
    }
    void setNextNode(Node nextNode){
      this.nextNode = nextNode;
    }
    Node getNextNode(){
      return this.nextNode;
    }
    int getData(){
      return this.data;
    }
  }
}
