package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class JPanels_java {

    public static void main(String[] args) {


        JLabel label = new JLabel("Hi!!!");
        ImageIcon image = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\butterfly.png");
        Image logo = image.getImage();
        Image modifiedimage = logo.getScaledInstance(200,200, Image.SCALE_SMOOTH);
        image = new ImageIcon(modifiedimage);
//        label.setHorizontalAlignment(JLabel.RIGHT);
//        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setBounds(0,0,75,75);
        label.setIcon(image);



        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0,0,250,250);
        redpanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);


        JPanel YellowPanel = new JPanel();
        YellowPanel.setBackground(Color.YELLOW);
        YellowPanel.setBounds(0,250,500,250);
        YellowPanel.setLayout(new BorderLayout());





        label.setFont(new Font("MV Boli", Font.PLAIN,40));

        JFrame frame = new JFrame("Bro");
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(redpanel);
        frame.add(bluePanel);
        frame.add(YellowPanel);
        frame.add(label);
        YellowPanel.add(label);








    }
}