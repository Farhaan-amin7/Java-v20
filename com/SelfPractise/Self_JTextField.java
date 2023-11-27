package com.SelfPractise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class  MyTextField implements ActionListener {  // This is the component of the container class which let's us to edit a single line of text.
    JTextField textField,textField1,textField2;
    JButton buttonPlus,buttonMinus;
    JFrame frame;

    MyTextField()
    {
        frame = new JFrame("Self-Practise");
        frame.setDefaultCloseOperation(3);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(33, 1, 1));

        buttonPlus = new JButton("+");
        buttonPlus.setLayout(null);
        buttonPlus.setBounds(50,100,100,50);
        buttonPlus.addActionListener(this);

        buttonMinus = new JButton("-");
        buttonMinus.setLayout(null);
        buttonMinus.setBounds(150,100,100,50);
        buttonMinus.addActionListener(this);


        textField = new JTextField("Enter FirstNum");
        textField.setSelectionStart(0);
        textField.setColumns(1);
        textField.setSelectionEnd(15);
        textField.setLayout(null);
        textField.setBackground(Color.WHITE);
        textField.setBounds(50,0,300,50);

        textField1 = new JTextField("Enter SecondNum");
        textField1.setSelectionStart(0);
        textField1.setSelectionEnd(16);
        textField1.setDragEnabled(true);
        textField1.setLayout(null);
        textField1.setBackground(Color.WHITE);
        textField1.setBounds(50,50,300,50);

        textField2 = new JTextField("");
        textField2.setLayout(null);
        textField2.setBackground(Color.WHITE);
        textField2.setFont(new Font("MV boli", Font.BOLD,20));
        textField2.setBounds(50,150,300,50);


        frame.add(textField);frame.add(textField1);frame.add(buttonPlus);frame.add(buttonMinus);frame.add(textField2);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       String str =textField.getText();
       String str2 = textField1.getText();
       int c;
       int a = Integer.parseInt(str);
       int b = Integer.parseInt(str2);

        if(e.getSource() == buttonPlus)
        {
            c = a + b;
            textField2.setText(String.valueOf(c));
        }
       else if(e.getSource() == buttonMinus)
        {
            c = b - a;
            textField2.setText(String.valueOf(c));
        }

    }
}
public class Self_JTextField {
    public static void main(String[] args) {
        new MyTextField();
    }
}