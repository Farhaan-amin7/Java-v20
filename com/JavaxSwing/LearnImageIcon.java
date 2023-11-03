package com.JavaxSwing;

import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.midi.Soundbank;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Test{
	 
	public Test() {
		JFrame frame = new JFrame("Application");
	 JPanel panel = new JPanel();
	 JLabel label = new JLabel();
	 
	 BufferedImage exampleImage;
	 
	 panel.setLayout(null);
	 
	 
	 frame.setSize(500,500);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 frame.add(panel);
	 
	 try {
		 ImageIcon imageIcon = new ImageIcon("logo.png");
		 frame.setIconImage(imageIcon.getImage());
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Image Not found!");
	}
	 frame.add(panel);
	 frame.setVisible(true);
	 
	 
	}
}

public class LearnImageIcon {
	public static void main(String[] args) {
		Test II = new Test();
		
		
	}

}
