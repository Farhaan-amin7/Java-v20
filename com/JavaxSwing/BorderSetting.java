package com.JavaxSwing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class BorderSetting  {


    BorderSetting()
    {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.setLayout(new BorderLayout(10,10));
      frame.setVisible(true);

      JPanel panel1 = new JPanel();
      JLabel label1 = new JLabel("FirstOne");
      label1.setHorizontalAlignment(JLabel.CENTER);
      label1.setVerticalAlignment(JLabel.CENTER);

      label1.setHorizontalTextPosition(JLabel.CENTER);
      label1.setVerticalTextPosition(JLabel.CENTER);
      panel1.add(label1);

      JPanel panel2 = new JPanel();
      JLabel label2 = new JLabel("SecondOne");
      panel2.add(label2);
      label2.setHorizontalTextPosition(JLabel.CENTER);
      label2.setVerticalTextPosition(JLabel.CENTER);
      JPanel panel3 = new JPanel();
      JLabel label3 = new JLabel("ThirdOne");
      panel3.add(label3);
      JPanel panel4 = new JPanel();
      JLabel label4 = new JLabel("FourthOne");
      panel4.add(label4);
      JPanel panel5 = new JPanel();
      JLabel label5 = new JLabel("FifthOne");
      panel5.add(label5);

      panel1.setBackground(Color.RED);
      panel2.setBackground(Color.green);
      panel3.setBackground(Color.YELLOW);
      panel4.setBackground(Color.magenta);
      panel5.setBackground(Color.blue);

      panel1.setPreferredSize(new Dimension(100,100));
      panel2.setPreferredSize(new Dimension(100,100));
      panel3.setPreferredSize(new Dimension(100,100));
      panel4.setPreferredSize(new Dimension(100,100));
      panel5.setPreferredSize(new Dimension(100,100));

//      frame.add(label1);
//      frame.add(label2);
//      frame.add(label3);
//      frame.add(label4);
//      frame.add(label5);


      //There are sub panels.
      // ----------------Sub Panels----------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.DARK_GRAY);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));



        // Adding the components within the container (Panel5)
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);




      frame.add(panel1,BorderLayout.NORTH);
      frame.add(panel2,BorderLayout.WEST);
      frame.add(panel3,BorderLayout.EAST);
      frame.add(panel4,BorderLayout.SOUTH);
      frame.add(panel5,BorderLayout.CENTER);

    }


}