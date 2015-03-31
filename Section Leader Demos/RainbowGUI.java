/**
 * Written by Drew Davidson
 * April 11th and April 12th in circa 2008 (or earlier)
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public final class RainbowGUI extends JFrame implements Observer {
  private Color[] myUnsortedColors;
  private Color[] myCurrentColors;
  private int myWidth, myHeight;
  private DrawPanel thePanel;
  private ButtonPanel buttonPanel;
  private Rainbow theRainbow;
  public static final int SIZE = 300;

  public static void main(String[] args) {
    RainbowGUI fg = new RainbowGUI();
    fg.setVisible(true);
  }

  public RainbowGUI() {
    // create a rainbow with 300 strands
    theRainbow = new Rainbow(SIZE, this);

    myCurrentColors = theRainbow.getArray();
    myUnsortedColors = new Color[myCurrentColors.length];

    // Make a value copy of the array
    for (int i = 0; i < myCurrentColors.length; i++) {
      myUnsortedColors[i] = myCurrentColors[i];
    }

    // Format the frame
    this.setTitle("Watch the actions of the... rainbow");
    this.setSize(900, 600);
    this.setLocation(100, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Format and manage the content pane
    Container contentPane = this.getContentPane();

    this.setBackground(Color.WHITE);

    // Format and add the buttonPanel
    buttonPanel = new ButtonPanel(Color.WHITE);
    JButton randomize = new JButton("Randomize");
    JButton sorted = new JButton("Sorted");
    JButton rainbowizeButton = new JButton("Rainbowize");

    // Slider bar to change speed
    JSlider speedBar = new JSlider(JSlider.HORIZONTAL);
    speedBar.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        if (!source.getValueIsAdjusting())
          theRainbow.updateSpeed((int) source.getValue() * 10);
      }
    });

    theRainbow.updateSpeed((int) speedBar.getValue() * 10);

    buttonPanel.add(randomize);
    buttonPanel.add(rainbowizeButton);
    // buttonPanel.add(sorted);
    JPanel control = new JPanel();
    GridLayout g = new GridLayout(2, 1);
    control.setLayout(g);
    control.add(buttonPanel);
    control.add(speedBar);

    contentPane.add(BorderLayout.SOUTH, control);

    // Format and add drawPanel
    myWidth = this.getWidth();
    myHeight = this.getHeight();
    thePanel = new DrawPanel();
    thePanel.setSize(myWidth, myHeight);
    contentPane.add(BorderLayout.CENTER, thePanel);

    // Create and register the button listeners
    RainbowizeListener rainbowListener = new RainbowizeListener();
    SortListener sortListener = new SortListener();

    sorted.addActionListener(rainbowListener);
    rainbowizeButton.addActionListener(sortListener);

    RandomListener randomListener = new RandomListener();
    randomize.addActionListener(randomListener);

    // show the rainbow frame
    this.setVisible(true);
  }

  private class DrawPanel extends JPanel {

    int myColumnWidth;
    int myPosition;
    int num;

    public DrawPanel() {
      myColumnWidth = myWidth / myCurrentColors.length;
      myPosition = 0;
      num = 0;
    }

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.drawStripe(g);
    }

    public void drawStripe(Graphics g) {
      for (int i = 0; i < myCurrentColors.length; i++) {
        g.setColor(myCurrentColors[i]);
        g.fillRect(myPosition, 0, myColumnWidth, myHeight);
        myPosition += myColumnWidth;
      }
      myPosition = 0;
    }

  }

  private class ButtonPanel extends JPanel {
    Color myColor;

    public ButtonPanel(Color colorIn) {
      myColor = colorIn;
    }

    @Override
    public void paintComponent(Graphics g) {
      g.setColor(myColor);
      g.fill3DRect(0, 0, this.getWidth(), this.getHeight(), false);
    }

  }

  private class RainbowizeListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0) {
      theRainbow.arrange();
      thePanel.repaint();
    }
  }

  private class SortListener implements ActionListener {

    public void actionPerformed(ActionEvent arg0) {
      Thread sortThread = new Thread() {
        @Override
        public void run() {
          theRainbow.arrange();
        }
      };
      sortThread.start();
    }
  }

  private class RandomListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0) {
      theRainbow.randomizeArray();
      myCurrentColors = theRainbow.getArray();
      thePanel.repaint();
    }
  }

  public void update(Observable arg0, Object arg1) {
    myCurrentColors = theRainbow.getArray();
    thePanel.repaint();
  }
}