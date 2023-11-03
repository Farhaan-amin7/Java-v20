package com.JavaxSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
   final int Panel_Width = 500;
   final int Panel_Height = 500;
   Image image;
   Image BackGroundImage;
   Timer timer;
   int xVelocity =2;
   int yVelocity =1;
   int x =0;
   int y =0;
    MyPanel(){
        this.setPreferredSize(new Dimension(Panel_Width,Panel_Height));
        this.setBackground(Color.BLACK);
        image = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\Tick.png").getImage();
        BackGroundImage = new ImageIcon("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\butterfly.png").getImage();

        timer = new Timer(10,this);
        timer.start();




    }
    public void paint(Graphics g){
        super.paint(g); // This will paint backGround.
        Graphics2D g2d = (Graphics2D) g;// Casting happened.
        g2d.drawImage(BackGroundImage,0,0,null);
        g2d.drawImage(image,x,xVelocity,null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>= Panel_Width - image.getWidth(null) || x<0)
        {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if(y>= Panel_Height - image.getHeight(null) || y<1)
        {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
       repaint();
    }
}