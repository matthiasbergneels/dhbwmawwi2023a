package lecture.chapter12;

public class Stack<T> {

  private Node<T> head;
  private int size;

  void push(T data){
    head = new Node(data, head);
    size++;
  }

  T pop(){
    if(head == null){
      return null;
    }

    T data = head.getData();
    head = head.getNextNode();
    size--;
    return data;
  }

  T peek(){
    return (head == null) ? null : head.getData();
  }

  int size(){
    return size;
  }

  private class Node<T>{
    private T data;
    private Node<T> nextNode;

    Node(T data, Node<T> nextNode){
      this.data = data;
      this.nextNode = nextNode;
    }

    T getData(){
      return this.data;
    }
    Node<T> getNextNode(){
      return nextNode;
    }
  }
}
