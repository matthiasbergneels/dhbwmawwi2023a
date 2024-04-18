package lecture.chapter10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;


import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame {

  public static final String ACTION_OK = "ACTION_OK";
  public static final String ACTION_CLOSE = "ACTION_CLOSE";
  public static final String ACTION_PRINT = "ACTION_PRINT";

  public Logon() throws ParseException {
    super();
    this.setTitle("Logon");
    this.setAlwaysOnTop(true);
    this.setName("Logon");
    this.setResizable(false);
    //this.setUndecorated(true);
    //this.setOpacity(0.5f);

    final String[] PROTOCOL_VALUE_HELP = {"FTP", "Telnet", "SMTP", "HTTP"};
    JComboBox<String> myComboBox = new JComboBox<>(PROTOCOL_VALUE_HELP);

    JFormattedTextField portField = new JFormattedTextField(new MaskFormatter("#####"));
    portField.setColumns(3);

    myComboBox.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
          System.out.println("Item: " + e.getItem());
          System.out.println("State Change: " + e.getStateChange());
          System.out.println("Parameter String: " + e.paramString());

          if(e.getItem().equals("HTTP")){
            portField.setText("80");
          } else if(e.getItem().equals("FTP")){
            portField.setText("21");
          } else {
            portField.setText("");
          }
        }
      }
    });

    // initialize Panels
    JPanel mainPanel = new JPanel(new BorderLayout());

    JPanel southPanel = new JPanel(new FlowLayout());
    JPanel centerPanel = new JPanel(new FlowLayout());

    JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
    JPanel filePanel = new JPanel(new GridLayout(0, 2));

    FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

    //create & assign elements for connection area
    JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("User:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(3));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Passwort:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JPasswordField(5));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Art:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(myComboBox);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Host:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JTextField host = new JTextField(5);
    flowLayoutForCell.add(host);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Port:"));
    connectionPanel.add(flowLayoutForCell);

    connectionPanel.add(portField);

    // create & add Fields for File Area
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Quelle:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Ziel:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);

    // create & assign Buttons
    JButton okButton = new JButton("Ok");
    JButton cancelButton = new JButton("Schließen");
    JButton printButton = new JButton("Ausgabe");

    southPanel.add(okButton);
    okButton.setActionCommand(ACTION_OK);
    southPanel.add(cancelButton);
    cancelButton.setActionCommand(ACTION_CLOSE);
    southPanel.add(printButton);
    printButton.setActionCommand(ACTION_PRINT);

    ActionListener buttonListener = e -> {
      System.out.println("ActionCommand: " + e.getActionCommand());
      System.out.println("Parameter String: " + e.paramString());
      System.out.println("Modifiers: " + e.getModifiers());

      if(e.getActionCommand().equals(ACTION_CLOSE)){
        System.exit(0);
      } else if (e.getActionCommand().equals(ACTION_PRINT)){
        System.out.println("Protokoll: " + myComboBox.getSelectedItem() + "; Port: " + portField.getText());
      }
    };

    cancelButton.addActionListener(buttonListener);
    okButton.addActionListener(buttonListener);
    printButton.addActionListener(buttonListener);

    // create & assign Borders
    Border etchedBorder = BorderFactory.createEtchedBorder();
    Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
    Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
    Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

    connectionPanel.setBorder(connectionBorder);
    filePanel.setBorder(fileBorder);
    centerPanel.setBorder(centerBorder);

    // combine Panels
    centerPanel.add(connectionPanel);
    centerPanel.add(filePanel);

    mainPanel.add(centerPanel, BorderLayout.CENTER);
    mainPanel.add(southPanel, BorderLayout.SOUTH);

    this.add(mainPanel);

    // JMenuBar
    JMenuBar myMenuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");

    JMenuItem printMenuItem = new JMenuItem("Ausgabe");
    printMenuItem.setActionCommand(ACTION_PRINT);
    printMenuItem.addActionListener(buttonListener);
    JMenuItem closeMenuItem = new JMenuItem("Schließen");
    closeMenuItem.setActionCommand(ACTION_CLOSE);
    closeMenuItem.addActionListener(buttonListener);

    fileMenu.add(printMenuItem);
    fileMenu.addSeparator();
    fileMenu.add(closeMenuItem);

    myMenuBar.add(fileMenu);
    this.setJMenuBar(myMenuBar);


    // AWT MenuBar
    MenuBar myAwtMenuBar = new MenuBar();
    Menu awtFileMenu = new Menu("File (AWT)");

    MenuItem awtPrintMenuItem = new MenuItem("Ausgabe");
    awtPrintMenuItem.setActionCommand(ACTION_PRINT);
    awtPrintMenuItem.addActionListener(buttonListener);
    MenuItem awtCloseMenuItem = new MenuItem("Beenden");
    awtCloseMenuItem.setActionCommand(ACTION_CLOSE);
    awtCloseMenuItem.addActionListener(buttonListener);

    awtFileMenu.add(awtPrintMenuItem);
    awtFileMenu.addSeparator();
    awtFileMenu.add(awtCloseMenuItem);

    myAwtMenuBar.add(awtFileMenu);
    this.setMenuBar(myAwtMenuBar);


    // set JFrame behavior
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) throws ParseException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

    // Set cross-platform Java L&F (also called "Metal")
    System.out.println(UIManager.getLookAndFeel());
    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    //System.out.println(UIManager.getLookAndFeel());

    GraphicsDevice defaultScreenDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

    System.out.println(String.format("Screen Dimension: %.0f x %.0f",
      defaultScreenDevice.getDefaultConfiguration().getBounds().getWidth(),
      defaultScreenDevice.getDefaultConfiguration().getBounds().getHeight()));

    new Logon();

    GraphicsEnvironment virtualGraphicsEvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] screens = virtualGraphicsEvironment.getScreenDevices();

    for(GraphicsDevice screen : screens){
      System.out.println(screen);
      System.out.println(screen.getDefaultConfiguration());
      System.out.println(screen.getDisplayMode());
      System.out.println(screen.getDefaultConfiguration().getBounds());
      System.out.println(screen.getDefaultConfiguration().getBounds().getWidth() + " x " + screen.getDefaultConfiguration().getBounds().getHeight());
      System.out.println(screen.getDefaultConfiguration().getBounds().getX() + " / " + screen.getDefaultConfiguration().getBounds().getY());
    }
  }
}