package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe2 extends JFrame  {
   public JButton button;
   JLabel label;
    Myframe2() {

        ImageIcon icon = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\pointer.png");
        Image pointer = icon.getImage();
        label = new JLabel();
        ImageIcon icon2 = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\face.png");
        Image pointer2 = icon2.getImage();
        Image Modified = pointer2.getScaledInstance(200,100,Image.SCALE_SMOOTH);
        icon2.setImage(Modified);
        Image modified = pointer.getScaledInstance(150, 75, Image.SCALE_SMOOTH);
        icon.setImage(modified);


        label.setIcon(icon2);
        label.setBounds(150,250,200,150);
        label.setVisible(false);

        button = new JButton("Click me");

        button.addActionListener(ae -> {
            if(ae.getSource() == button)
            {
                System.out.println("Clicked");
                label.setVisible(true);
            }
        });
        button.setBounds(100, 100, 250, 100);
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.PLAIN, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }


}