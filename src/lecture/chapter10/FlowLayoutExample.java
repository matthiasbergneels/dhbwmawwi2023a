package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

  private FlowLayoutExample(){
    super("FlowLayout Example");

    JPanel mainPanel = new JPanel();

    mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

    mainPanel.add(new JLabel("Was wollen wir?"));
    mainPanel.add(new JButton("Feierabend"));
    mainPanel.add(new JButton("Noch mehr Vorlesung"));

    this.add(mainPanel);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FlowLayoutExample();
  }

}
