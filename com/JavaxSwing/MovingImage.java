package com.JavaxSwing;

import javax.swing.*;

public class MovingImage extends JFrame{
    MyPanel panel ;
    MovingImage() {
        panel = new MyPanel();
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.pack();
        this.setLocationRelativeTo(null);
        this.add(panel);







        this.setVisible(true);



    }
}