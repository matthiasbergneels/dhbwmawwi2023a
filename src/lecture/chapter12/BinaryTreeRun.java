package lecture.chapter12;

import java.sql.SQLOutput;

public class BinaryTreeRun {

  public static void main(String[] args) {
    BinaryNumberTree numberTree = new BinaryNumberTree();

    numberTree.add(100);
    numberTree.add(50);
    numberTree.add(40);
    numberTree.add(80);
    numberTree.add(150);
    numberTree.add(120);
    numberTree.add(180);



    BinaryTree<String> wordTree = new BinaryTree<>();

    wordTree.add("Moritz");
    wordTree.add("Bernhard");
    wordTree.add("Richard");
    wordTree.add("Wilhelm");
    wordTree.add("Alfred");

    System.out.println("Ausgabe in-Order:");
    wordTree.print();

    System.out.println("Ausgabe Pre-Order:");
    wordTree.printPreOrder();

    System.out.println("Ausgabe Post-Order:");
    wordTree.printPostOrder();
  }

}
