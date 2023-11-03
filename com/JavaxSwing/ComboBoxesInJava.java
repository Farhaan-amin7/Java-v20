package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class ComboBoxesInJava extends JFrame implements ActionListener {
     JComboBox ComboBox;

     ComboBoxesInJava ()// -> We need to pass a reference data types. And use wrapper classes if you want ot store data in the form of primitive data Types
    {


      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(new FlowLayout());
      String [] Animals={"Cat","Dog","CHicken"};
       ComboBox = new JComboBox(Animals);
       ComboBox.addActionListener(this);

//       *Methods In JComboBox*/
       ComboBox.setEditable(true);
        System.out.println(ComboBox.getItemCount());
        ComboBox.addItem("Horse");
        ComboBox.insertItemAt("Cook",0);
        ComboBox.setSelectedIndex(0);
        ComboBox.removeItemAt(2);
        ComboBox.removeAll();




        this.add(ComboBox);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == ComboBox)
        {
//            System.out.println(ComboBox.getSelectedItem());
            System.out.println(ComboBox.getSelectedIndex() + 1);
        }
    }
}