package lecture.chapter12;

public class BinaryTree<T extends Comparable> {

  // TODO:
  // 1. Umstellen auf Generic
  // 2. Ausgabe aller Elemente in der richtigen Reihenfolge --> vom kleinsten zum größten Element

  private Node root;
  private int size;

  public boolean add(T data){
    Node<T> newNode = new Node<T>(data);

    if(root == null){
      root = newNode;
      size++;
      return true;
    }

    Node<T> currentNode = root;
    return add(currentNode, newNode);
  }

  private boolean add(Node<T> currentNode, Node<T> newNode){
    if(currentNode.getData().equals(newNode.getData())){
      return false;
    }

    if((currentNode.getData()).compareTo(newNode.getData()) > 0){
      if(currentNode.getLeftNode() != null){
        add(currentNode.getLeftNode(), newNode);
      }else {
        currentNode.setLeftNode(newNode);
        size++;
        return true;
      }
    }else {
      if(currentNode.getRightNode() != null){
        add(currentNode.getRightNode(), newNode);
      }else {
        currentNode.setRightNode(newNode);
        size++;
        return true;
      }
    }
    return false;
  }



  // traversieren  (path traversal)

  // in-order traversal auf Teilbaumebene: --> left - current - right

  public void print(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    printTree(root);
  }
  private void printTree(Node<T> currentNode){
    if(currentNode.getLeftNode() != null){
      printTree(currentNode.getLeftNode());
    }
    System.out.println(currentNode.getData());
    if(currentNode.getRightNode() != null){
      printTree(currentNode.getRightNode());
    }
  }

  // pre-order traversal auf Teilbaumebene: --> current - left - right
  public void printPreOrder(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    printPreOrder(root);
  }

  private void printPreOrder(Node<T> currentNode){
    System.out.println(currentNode.getData());

    if(currentNode.getLeftNode() != null){
      printTree(currentNode.getLeftNode());
    }

    if(currentNode.getRightNode() != null){
      printTree(currentNode.getRightNode());
    }
  }


  // post-order traversal auf Teilbaumebene: --> left - right - current

  public void printPostOrder(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    printPostOrder(root);
  }
  private void printPostOrder(Node<T> currentNode){
    if(currentNode.getLeftNode() != null){
      printTree(currentNode.getLeftNode());
    }

    if(currentNode.getRightNode() != null){
      printTree(currentNode.getRightNode());
    }

    System.out.println(currentNode.getData());
  }

  private class Node<T>{
    private T data;
    private Node<T> leftNode;
    private Node<T> rightNode;

    Node(T data){
      this.data = data;
      this.leftNode = null;
      this.rightNode = null;
    }

    public T getData() {
      return data;
    }

    public Node<T> getLeftNode() {
      return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
      this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
      return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
      this.rightNode = rightNode;
    }
  }
}
