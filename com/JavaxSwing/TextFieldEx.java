package com.JavaxSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class TextFieldEx extends JFrame implements ActionListener{
    JTextField textField ;
    JButton button;
    TextFieldEx()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        textField = new JTextField();
        button = new JButton("Submit");



        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));
        button.addActionListener(this);
        textField.setForeground(Color.green);
        textField.setBackground(new Color(140,22,69));
        textField.setCaretColor(Color.BLUE);
        textField.setText("userName");
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }


    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == button)
        {
            System.out.println("Welcome " + textField.getText());
            textField.setEnabled(false);
            textField.setEditable(false);
        }
    }


}