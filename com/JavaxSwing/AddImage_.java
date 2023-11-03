package com.JavaxSwing;
import javax.swing.*;
import java.awt.*;



public class AddImage_ extends JFrame {
    public AddImage_(String imagePath)
{
    JPanel panel = new JPanel()
    {
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon(imagePath);
            Image image = imageIcon.getImage();

            if(image!=null)
            {
                int x = (getWidth()- image.getWidth(null))/2;
                int y = (getHeight()- image.getHeight(null))/2;
                g.drawImage(image,x,y,this);
            }
        }

    };
    this.getContentPane().add(panel);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000,1000);
    setLocationRelativeTo(null);
    setVisible(true);

}

    public static void main(String[] args) {
        new AddImage_("D:\\java-programing\\java-programing\\src\\com\\JavaxSwing\\logo.png");
    }
}