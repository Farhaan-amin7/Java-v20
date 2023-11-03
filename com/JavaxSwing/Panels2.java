package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;

public class Panels2 extends JPanel {
Image image ;
    Panels2()
    {
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(Color.BLACK);
        image = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\Tick.png").getImage();
        this.setOpaque(true);


    }
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,0,0,null);
//        g2d.drawLine(0,0,600,600);
//        g2d.setStroke(new BasicStroke(10));
        g2d.setPaint(Color.BLUE);
        g2d.drawRect(0,0,100,200);
        g2d.fillRect(0,0,100,200);
        g2d.drawOval(0,0,100,100);
        g2d.setPaint(Color.ORANGE);
        g2d.fillOval(0,0,100,100);
        g2d.setPaint(Color.RED);
        g2d.drawArc(0,0,100,100,0,180);
        g2d.fillArc(0,0,100,100,0,180);

        g2d.setPaint(Color.WHITE);
        g2d.drawArc(0,0,100,100,180,0);
        g2d.fillArc(0,0,100,100,180,0);

        int [] xpoints = {150,250,350};
        int [] ypoints = {150,250,350};
        g2d.drawPolygon(xpoints,ypoints,3);
        g2d.setPaint(new Color(120,0,0));
        g2d.fillPolygon(xpoints,ypoints,3);
        g2d.setFont(new Font("MV Boli", Font.BOLD,50));
        g2d.drawString("You are a Winner",50,50);







    }
}