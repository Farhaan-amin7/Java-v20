package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;

class Paint2DGraphics extends JFrame {

        Panels2 panel;
    Paint2DGraphics() {
        panel = new Panels2();
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(panel);


        this.setVisible(true);
    }

}