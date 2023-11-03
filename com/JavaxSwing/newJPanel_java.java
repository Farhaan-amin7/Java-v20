package com.JavaxSwing;

import java.awt.*;
import javax.swing.*;

public class newJPanel_java extends JPanel{
    public void paintComponent(Graphics g)
    {
        ImageIcon image = new ImageIcon("logo.png");
        g.drawImage(image.getImage(),200,200,150,150,null);

    }


}