package com.SelfPractise;


import javax.swing.*;
import java.awt.*;

class First{
    JFrame frame;
    JLabel label;
    public First()
    {
        frame = new JFrame();
        frame.setTitle("Self-Learning Gui Components");
        frame.setDefaultCloseOperation(3);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(255,25,100));

        label = new JLabel();
        label.setLayout(null);
        label.setText("This is a label");
        label.setFont(new Font("Helvetica",Font.PLAIN,50));
        label.setBackground(Color.darkGray);
//        label.setHorizontalTextPosition(50);
        label.setSize(100,100);
        label.setLocation(50,200);

        frame.add(label);

    }



}
public class Main {
    public static void main(String[] args) {
       First first = new First();

    }
}