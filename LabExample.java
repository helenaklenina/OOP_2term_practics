package ru.mirea.lab.klenina.lab5lab6;

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

public class LabExample extends JFrame {

    JPanel [] jp = new JPanel[12];

    JTextArea jtf = new JTextArea(10,25);

    JButton btn = new JButton("Push me");

    JButton btnImg = new JButton("Show image");

    JButton btnCenter = new JButton("Center");
    JButton btnEast = new JButton("East");
    JButton btnWest = new JButton("Wast");
    JButton btnNorth = new JButton("North");
    JButton btnSouth = new JButton("South");


  //  private Image image;

    public LabExample() {
        super("GraphInter");
        setSize(800,500);
        setLayout(new GridLayout(3,4));
        for (int i = 0; i < jp.length; i++) {
            int r = (int) (Math.random()  * 255);
            int g = (int) (Math.random()  * 255);
            int b = (int) (Math.random()  * 255);
            jp [i] = new JPanel();
            jp [i].setBackground(new Color(r,g,b));
            add(jp [i]);

            //loadImage();
        }

        jp [4].setLayout(new BorderLayout());
        jp [4].add(new JButton("East"), BorderLayout.EAST);
        jp [4].add(new JButton("West"), BorderLayout.WEST);
        jp [4].add(new JButton("South"), BorderLayout.SOUTH);
        jp [4].add(new JButton("North"), BorderLayout.NORTH);
        jp [4].add(new JButton("Center"), BorderLayout.CENTER);

        jp [10].setLayout(new FlowLayout());
        jp [10].add(btnEast);
        jp [10].add(btnWest);
        jp [10].add(btnSouth);
        jp [10].add(btnNorth);
        jp [10].add(btnCenter);


        btnCenter.addMouseListener(new MouseListener() {

                                  @Override
                                  public void mouseEntered(MouseEvent e) {
                                      JOptionPane.showMessageDialog(null,"Добро пожаловать в");
                                  }
                                  @Override
                                  public void mouseClicked(MouseEvent e) { }
                                  @Override
                                  public void mousePressed(MouseEvent e) { }
                                  @Override
                                  public void mouseReleased(MouseEvent e) { }
                                  @Override
                                  public void mouseExited(MouseEvent e) { }
                              });
        btnEast.addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Дахране");

            }
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        btnNorth.addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в");
            }
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        btnWest.addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Джидда");

            }
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        btnSouth.addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать Абха");
            }
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) { }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseExited(MouseEvent e) { }
        });

        jp [5].add (new JLabel ("Poock"));
        jp [2].add(jtf);
        jp [5].add(btn);
        {
            btn.addActionListener(new ActionListener() {
                                      @Override
                                      public void actionPerformed(ActionEvent e) {
                                          {
                                              String txt = JOptionPane.showInputDialog(null, "Insert some text");

                                              jtf.append(txt);

                                          }
                                      }
                                  }
            );
        }

        ImageIcon image = new ImageIcon("/Users/macbokpro/Desktop/11-4.jpg");
        jp [7].add (new JLabel (image));
        setVisible(true);
    }


}