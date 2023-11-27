package com.SelfPractise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

class MyJLabel extends JLabel implements ActionListener {

    JLabel label,label1;
    JTextField textField;
    JFrame frame;
    JButton button;

    MyJLabel()
    {
        frame = new JFrame();
        button = new JButton("Find IP Address");
        textField = new JTextField();

        textField.setText("Enter your Website");
        textField.setLayout(null);
//        textField.set
        textField.setEditable(true);
        textField.setFont(new Font("Mv boli",Font.PLAIN,20));

        textField.setBounds(35,20,250,50);


        button.setLayout(null);
        button.setBounds(35,70,150,50);


        frame.setDefaultCloseOperation(3);
        frame.setSize(500,500);
        frame.setTitle("JLabel Practise frame");
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(33, 1, 1));

        label = new JLabel(" ");
        label1 = new JLabel();

        label.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setLayout(null);
        label.setForeground(Color.WHITE);
        label.setBounds(35,120,350,50);

//        label1.setText("This is the Second Label"); --> Additional label for practise.
//        label1.setLayout(null);
//        label1.setBounds(100,30,150,200);
        button.addActionListener(this);






        frame.add(textField);frame.add(button);frame.add(label);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Host = textField.getText();
        try {
            String ip = java.net.InetAddress.getByName(Host).getHostAddress();
            label.setText("IP of host " + Host + " is: " + ip);
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        }
    }
}
public class Self_JLabel {
    public static void main(String[] args) {
        new MyJLabel ();
    }
}