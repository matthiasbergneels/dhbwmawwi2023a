package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

  private BorderLayoutExample(){
    super("BorderLayout Example");

    JPanel mainPanel = new JPanel();

    mainPanel.setLayout(new BorderLayout());

    mainPanel.add(new JButton("Norden"), BorderLayout.NORTH);
    mainPanel.add(new JButton("Süden"), BorderLayout.SOUTH);
    mainPanel.add(new JButton("Osten"), BorderLayout.EAST);
    mainPanel.add(new JButton("Westen"), BorderLayout.WEST);
    mainPanel.add(new JButton("Zentrum"), BorderLayout.CENTER);

    this.add(mainPanel);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new BorderLayoutExample();
  }
}
