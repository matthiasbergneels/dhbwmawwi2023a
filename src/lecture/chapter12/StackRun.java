package lecture.chapter12;

public class StackRun {
  public static void main(String[] args) {

    Stack<String> wordStack = new Stack<>();

    wordStack.push("!");
    wordStack.push("Feierabend");
    wordStack.push("machen");
    wordStack.push("Wir");

    while(wordStack.peek() != null){
      System.out.print(wordStack.pop() + " ");
    }

    System.out.println();
    System.out.println("Danke!");

  }
}
