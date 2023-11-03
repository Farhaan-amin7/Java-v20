package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class FileChoserClass extends JFrame implements ActionListener {
    //    JFileChoser -> A GUI mechanism that let's a user choose a file (helpful for opening or saving) in your computer.
 JButton button;
    FileChoserClass()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button =  new JButton("Select file");
        this.add(button);

        this.pack();
        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            JFileChooser fileChooser = new JFileChooser();
//            fileChooser.getCurrentDirectory(new File("."));

            int response = fileChooser.showOpenDialog(null); // This will select file to open.
            System.out.println(response);

            if(response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }



        }
    }



}