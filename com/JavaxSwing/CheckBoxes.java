package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxes extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon Ticon;
    CheckBoxes()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        xIcon = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\cross.png.jpg");
        Ticon = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\Tick.png");

        this.setLayout(new FlowLayout());



        checkBox = new JCheckBox();
        button = new JButton("Submit");
        button.addActionListener(this);
        this.add(button);
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,25));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(Ticon);

        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == button)
        {
            System.out.println(checkBox.isSelected());
        }
    }
}