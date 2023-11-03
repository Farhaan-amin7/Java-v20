package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtons extends JFrame implements ActionListener {
    JRadioButton PizzaButton;
    JRadioButton HambugerButton;
    JRadioButton HotDogButton;
    RadioButtons()     // -> Only one button can be selected in the group.
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        PizzaButton = new JRadioButton("Pizza");
        HambugerButton = new JRadioButton("Hambuger");
        HotDogButton = new JRadioButton("HotDog");

        ButtonGroup group = new ButtonGroup();
        group.add(PizzaButton);
        group.add(HambugerButton);
        group.add(HotDogButton);

        PizzaButton.addActionListener(this);
        HambugerButton.addActionListener(this);
        HotDogButton.addActionListener(this);


        this.add(PizzaButton);
        this.add(HambugerButton);
        this.add(HotDogButton);


        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == PizzaButton) {
            System.out.println("You have ordered a pizza!");
        }
        else if(ae.getSource() == HambugerButton){
            System.out.println("You have ordered a HamBurger!");
        }
        else if(ae.getSource() == HotDogButton){
            System.out.println("You have ordered a HotDog!");
        }
    }
}