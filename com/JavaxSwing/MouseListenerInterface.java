package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseListenerInterface extends JFrame implements MouseListener {
    JLabel label ;


    MouseListenerInterface() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);


        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(0,0,100,100);
        label.addMouseListener(this);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);









    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked a mouse");
        label.setBackground(new Color(133,133,133));
    }

    @Override
    public void mousePressed(MouseEvent e) {
//  Invoked when a mouse is pressed over a component.
        System.out.println("You Pressed the mouse");
        label.setBackground(new Color(3,13,33));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//  Invoked when a mouse is released over a component.
        System.out.println("You Released the mouse");
        label.setBackground(new Color(63,13,83));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You Entered into the component");
        label.setBackground(new Color(103,103,83));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You Exited the component");
        label.setBackground(new Color(43,109,103));
    }
}