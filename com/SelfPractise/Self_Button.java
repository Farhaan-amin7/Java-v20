package com.SelfPractise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Mybutton extends JButton implements ActionListener {
    JFrame frame;
    Color color;
    JButton button,buttonRightPanel,buttonUpperPanel,buttonLowerPanel;
    JPanel panelLeft,panelRight,panelUpper,panelLower,ultimatePanel;
    Mybutton()
    {
        frame = new JFrame();
        ultimatePanel = new JPanel();
        panelLeft  = new JPanel();
        panelRight = new JPanel();
        panelUpper = new JPanel();
        panelLower = new JPanel();
        color = new Color(0x15E515);

        frame.setDefaultCloseOperation(3);
        frame.setSize(new Dimension(800,800));
        frame.setLayout(null); // --> (Should be null)Without this the button will take the entire frame as his Space so we won't actually get the button as it is.
        frame.setTitle("Self-Button Practise");





//        panelLeft.setPreferredSize(new Dimension(200,600));
        panelLeft.setBounds(0,100,200,500);
        panelLeft.setLayout(null);
        panelLeft.setBackground(new Color(24, 21, 125));

        panelUpper.setBounds(0,0,800,100);
        panelUpper.setLayout(null);
        panelUpper.setBackground(new Color(217, 16, 151));

        panelRight.setBounds(600,100,200,500);
        panelRight.setBackground(Color.yellow);
        panelRight.setLayout(null);

        panelLower.setBounds(0,600,800,200);
        panelLower.setLayout(null);
        panelLower.setBackground(new Color(129, 65, 65));




        button = new JButton("LeftSideButton");
        buttonLowerPanel = new JButton("LowerSideButton");
        buttonRightPanel = new JButton("RightSideButton");
        buttonUpperPanel = new JButton("UpperSideButton");


        button.setFocusable(false);
        button.setBounds(35,220,120,50);
        button.setBackground(new Color(69,123,231));

        buttonUpperPanel.setBounds(325,25,210,40);
        buttonUpperPanel.setFocusable(false);
        buttonUpperPanel.setBackground(new Color(178, 29, 74));

        buttonRightPanel.setBackground(Color.GRAY);
        buttonRightPanel.setBounds(35,220,120,50);
        buttonRightPanel.setFocusable(false);

        buttonLowerPanel.setBounds(325,25,210,40);
        buttonLowerPanel.setFocusable(false);
        buttonLowerPanel.setBackground(new Color(87,199,200));

        button.addActionListener(this);
        buttonLowerPanel.addActionListener(this);
        buttonRightPanel.addActionListener(this);
        buttonUpperPanel.addActionListener(this);

        panelLeft.add(button);
        panelRight.add(buttonRightPanel);
        panelLower.add(buttonLowerPanel);
        panelUpper.add(buttonUpperPanel);



        ultimatePanel.add(panelLeft);
        ultimatePanel.add(panelUpper);
        ultimatePanel.add(panelRight);
        ultimatePanel.add(panelLower);


        ultimatePanel.setSize(800,800);
        ultimatePanel.setLayout(new BorderLayout());
        frame.add(ultimatePanel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource()==button && panelLeft.getBackground() == Color.GREEN) {
                panelLeft.setBackground(new Color(24, 21, 125));
            } else {
                panelLeft.setBackground(Color.GREEN);
            }



        if(e.getSource().equals(buttonUpperPanel))
        {
            panelUpper.setBackground(new Color(203, 129, 32));
        }
        if(e.getSource().equals(buttonRightPanel))
        {
            panelRight.setBackground(new Color(113, 141, 64));
        }
        if(e.getSource().equals(buttonLowerPanel))
        {
            panelLower.setBackground(new Color(90, 22, 117, 255));
        }
    }
}
public class Self_Button {
    public static void main(String[] args) {
         new Mybutton();
    }


}