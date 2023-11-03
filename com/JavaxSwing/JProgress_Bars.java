package com.JavaxSwing;

import javax.swing.*;

import java.awt.*;

import static java.util.Collections.fill;

public class JProgress_Bars {
    JFrame frame = new JFrame();

    JProgressBar bar = new JProgressBar(0,100);

//JProgressBar ->  Visual aid to let the user know that an operation is processing.
    JProgress_Bars()
    {
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.PLAIN,25));
        bar.setForeground(Color.LIGHT_GRAY);
        bar.setBackground(Color.BLACK);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,550);
        frame.setLayout(null);
        frame.add(bar);
        bar.setLocation(250,150);
        frame.setVisible(true);
        fill();






    }
    public void fill()
{
    int counter = 100;
    while (counter>=0) {
        bar.setValue(counter);
        try {
            Thread.sleep(50);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        counter -= 1;
    }
    bar.setString("Done :)");

  }
}