package com.JavaxSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static javax.print.attribute.standard.MediaSizeName.D;


public class Swing_First {
    public static void main(String[] args) {
        JFrame jf = new JFrame();


        jf.setVisible(true);
        jf.setSize(500,500); // Sets the X and Y dimensions of the frame
        jf.setBackground(Color.DARK_GRAY);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(true); // Prevent frame from being resized.
        jf.setTitle("First Java Swing");
        jf.setLayout(new BorderLayout());



        ImageIcon image = new ImageIcon(("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\logo.png"));
        jf.setIconImage(image.getImage());
        jf.getContentPane().setBackground(new Color(14,12,69));
        // This will change icon of the frame








    }
}