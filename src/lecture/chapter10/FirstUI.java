package lecture.chapter10;

import javax.swing.*;

public class FirstUI {

  public static void main(String[] args) {
    JFrame myJFrame = new JFrame("My first UI");

    myJFrame.add(new JLabel("Was wollen wir?"));
    myJFrame.add(new JButton("Feierabend"));
    myJFrame.add(new JButton("Noch mehr Vorlesung"));


    myJFrame.pack();
    myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myJFrame.setVisible(true);
  }
}
