package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class JPanels_java {

    public static void main(String[] args) {


        JLabel label = new JLabel("Hi!!!");
        ImageIcon image = new ImageIcon("logo.png");
        label.setIcon(image);



        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);


        JPanel YellowPanel = new JPanel();
        YellowPanel.setBackground(Color.YELLOW);
        YellowPanel.setBounds(0,50,50,50);
        YellowPanel.setLayout(new FlowLayout());





        label.setFont(new Font("MV Boli", Font.PLAIN,40));

        JFrame frame = new JFrame("Bro");
        frame.setSize(550,550);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(redpanel);
        frame.add(bluePanel);
        YellowPanel.add(label);
    }
}