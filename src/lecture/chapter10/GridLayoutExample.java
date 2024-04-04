package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

  private GridLayoutExample(){
    super("GridLayout Example");

    JPanel mainPanel = new JPanel();

    mainPanel.setLayout(new GridLayout(0, 2));

    mainPanel.add(new Label("Zelle 01"));
    mainPanel.add(new Label("Zelle 02"));
    mainPanel.add(new Label("Zelle 03"));
    mainPanel.add(new Label("Zelle 04"));
    mainPanel.add(new Label("Zelle 05"));
    mainPanel.add(new Label("Zelle 06"));
    mainPanel.add(new Label("Zelle 07"));
    mainPanel.add(new JButton("Zelle 08"));

    JPanel cell09Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    cell09Panel.add(new JButton("Zelle 09"));

    mainPanel.add(cell09Panel);

    this.add(mainPanel);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new GridLayoutExample();
  }
}
