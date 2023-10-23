package com.JavaxSwing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class MyFrame extends JFrame{
    MyFrame()
    {
        JFrame jf = new JFrame();
        jf.setSize(500,500);
        jf.setLayout(new BorderLayout());
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.CYAN);
        label.setText("Bro, Do you even code!");
        // creates the label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
         // Sets the X and Y dimensions of the frame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setFont(new Font("MV Boli", Font.PLAIN,25));
        jf.setBackground(new Color(99,99,99));
        label.setOpaque(true);
        label.setBackground(new Color(159,65,47));
        label.setForeground(new Color(19, 27, 123));
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,100,350,350);



        label.setText("Bro, Do you even code!");
        jf.add(label);
        jf.pack();
//        jf.setLayout(null);

        jf.setVisible(true);
    }
}
public class JFrame_Java {
    public static void main(String[] args) {
        MyFrame NewMyFrame = new MyFrame();
    }
}