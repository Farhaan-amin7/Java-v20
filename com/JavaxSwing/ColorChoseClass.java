package com.JavaxSwing;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChoseClass extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    ColorChoseClass() // -> Mechanism that let's  user chose a color.
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("Pick a Color");
        button.addActionListener(this);
        label = new JLabel("This is some text");
        label.setBackground(Color.GRAY);
        label.setOpaque(true);
        label.setFont(new Font("MV Boli", Font.PLAIN,30));
        this.add(button);
        this.add(label);




        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            JColorChooser colorchoser = new JColorChooser();

            Color color = new JColorChooser().showDialog(null, "Pick a color....I guess", Color.BLACK);
//            label.setForeground(color);
            label.setBackground(color);

        }

    }
}