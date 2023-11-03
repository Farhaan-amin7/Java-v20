package com.JavaxSwing;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

class KeylistenerInterface extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon imageIcon;
    KeylistenerInterface()
    {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(500,500);
      this.setLayout(null);
      this.addKeyListener(this);
      this.setVisible(true);
      imageIcon = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\Tick.png");
      label.setIcon(imageIcon);
      this.getContentPane().setBackground(Color.BLACK);
      label = new JLabel();
      label.setBounds(0,0,100,100);
      label.setBackground(Color.red);
      label.setOpaque(true);
      this.add(label);

    }

    @Override
    public void keyTyped(KeyEvent e) {
//        char as output

    }

    @Override
    public void keyPressed(KeyEvent e) {
//          Int as output
        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX() - 10, label.getY());
            case 38 -> label.setLocation(label.getX(), label.getY() - 10);
            case 39 -> label.setLocation(label.getX() + 10, label.getY());
            case 40 -> label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released the Key char : " + e.getKeyChar());
        System.out.println("You released the Key Code : " + e.getKeyCode());
    }
}