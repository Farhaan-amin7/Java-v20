package com.JavaxSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBarEx extends JFrame implements ActionListener {
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    MenuBarEx()
    {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();


        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");



        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);// L to Load
        saveItem.setMnemonic(KeyEvent.VK_S);// S to Save
        exitItem.setMnemonic(KeyEvent.VK_E);// E to Exit
        fileMenu.setMnemonic(KeyEvent.VK_F);// F to File
        helpMenu.setMnemonic(KeyEvent.VK_H);// H to Help
        editMenu.setMnemonic(KeyEvent.VK_I);// I to Edit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        this.setJMenuBar(menuBar);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);





        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == loadItem){
        System.out.println("Beeep Boop, You loaded a file");
    }
    else if (e.getSource() == saveItem)
    {
        System.out.println("Beep Boop, You saved an Item.");
    } else if (e.getSource() == exitItem) {
        System.out.println("Beep Boop, You are exiting the Page");
        System.exit(0);
        }
    }
}