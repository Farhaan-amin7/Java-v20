package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;

class StackedComponentsEx {
    StackedComponentsEx()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150,150,200,200);

        JLayeredPane LayeredPane = new JLayeredPane();
        LayeredPane.setBounds(0,0,500,500);
        LayeredPane.add(label1,Integer.valueOf(0));
        LayeredPane.add(label2,Integer.valueOf(1));
        LayeredPane.add(label3,Integer.valueOf(2));
        frame.add(LayeredPane);





    }
}