package com.JavaxSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSlider_in extends JFrame implements ChangeListener {
    JFrame frame;
    JLabel label;
    JPanel panel;
    JSlider slider;
    JSlider_in()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        slider = new JSlider(0,100,50);
        label = new JLabel();
        panel = new JPanel();

        panel.add(slider);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);


        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setFont(new Font("Mv Boli",Font.PLAIN,30));
        label.setFont(new Font("Mv Boli",Font.PLAIN,25));
        slider.setOrientation(SwingConstants.VERTICAL);
        label.setText("Degres C = " + slider.getValue());
        slider.addChangeListener(this);

        slider.setPaintLabels(true);

        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
    }
    public void stateChanged(ChangeEvent ce){
    label.setText("Degres C = " + slider.getValue() );
    }
}