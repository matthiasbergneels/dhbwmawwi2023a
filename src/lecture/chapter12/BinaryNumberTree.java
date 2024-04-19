package lecture.chapter12;

public class BinaryNumberTree {

  private Node root;
  private int size;

  public boolean add(int data){
    Node newNode = new Node(data);

    if(root == null){
      root = newNode;
      size++;
      return true;
    }

    Node currentNode = root;
    return add(currentNode, newNode);
  }

  private boolean add(Node currentNode, Node newNode){
    if(currentNode.getData() == newNode.getData()){
      return false;
    }

    if(currentNode.getData() > newNode.getData()){
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

  public boolean addIterativ(int data){
    Node newNode = new Node(data);

    if(root == null){
      root = newNode;
      size++;
      return true;
    }

    Node currentNode = root;

    while(true) {
      if (currentNode.getData() == newNode.getData()) {
        return false;
      }

      if (currentNode.getData() > newNode.getData()) {
        if (currentNode.getLeftNode() == null) {
          currentNode.setLeftNode(newNode);
          size++;
          return true;
        } else {
          currentNode = currentNode.getLeftNode();
        }
      } else {
        if (currentNode.getRightNode() == null) {
          currentNode.setRightNode(newNode);
          size++;
          return true;
        } else {
          currentNode = currentNode.getRightNode();
        }
      }
    }
  }

  private class Node{
    private int data;
    private Node leftNode;
    private Node rightNode;

    Node(int data){
      this.data = data;
      this.leftNode = null;
      this.rightNode = null;
    }

    public int getData() {
      return data;
    }

    public Node getLeftNode() {
      return leftNode;
    }

    public void setLeftNode(Node leftNode) {
      this.leftNode = leftNode;
    }

    public Node getRightNode() {
      return rightNode;
    }

    public void setRightNode(Node rightNode) {
      this.rightNode = rightNode;
    }
  }
}
