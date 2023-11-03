package com.HowToCreateANewWIndowInJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondFileLaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton MyButton = new JButton("New Window");
    SecondFileLaunchPage()
    {
        MyButton.setBounds(100,160,200,40);
        MyButton.setFocusable(false);
        MyButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(MyButton);


    }
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource() == MyButton)
         {
             frame.dispose();
             NewWindow mywindow = new NewWindow();
         }
    }
}