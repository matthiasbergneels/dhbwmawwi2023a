package lecture.chapter12;

public class LinkedList {

  private Node head;

  public void add(int data){
    Node newNode = new Node(data);

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
  // 2. Löschen eines Knotens anhand des Datenwertes (bei mehreren wird der erste gefundene Knoten gelöscht)
  // 3. implementieren der Methode size() --> Ausgabe wieviele elemente es gibt 


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
