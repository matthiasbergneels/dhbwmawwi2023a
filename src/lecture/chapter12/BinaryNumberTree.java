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

    return false;
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
