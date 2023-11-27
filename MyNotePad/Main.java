package MyNotePad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

class  NotePad implements ActionListener {
    JFrame f;
    JTextArea ta;
    JMenuBar mb;
    JMenu file,edit,format,help;
    JMenuItem NewI,OpenI,SaveI;
    JMenuItem Cut,Copy,Paste,Select;
    JMenuItem bg,fg;

    NotePad()
    {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setTitle("My Notepad");
        f.getContentPane().setBackground(Color.WHITE);
        f.setVisible(true);

        ta = new JTextArea();
        ta.setBounds(4,40,996,996);

        mb = new JMenuBar();
        mb.setBounds(4,5,996,30);
        f.add(mb);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        help = new JMenu("Help");
        bg = new JMenuItem("Set BackGround");
        fg = new JMenuItem("Set Foreground");

        NewI= new JMenuItem("New");
        OpenI = new JMenuItem("Open");
        SaveI = new JMenuItem("Save");

        Cut = new JMenuItem("Cut");
        Copy = new JMenuItem("Copy");
        Paste = new JMenuItem("Paste");
        Select = new JMenuItem("Select All");

        format.add(bg);
        format.add(fg);

        Cut.addActionListener(this);
        Copy.addActionListener(this);
        Paste.addActionListener(this);
        Select.addActionListener(this);

        bg.addActionListener(this);
        fg.addActionListener(this);
        
        NewI.addActionListener(this);
        OpenI.addActionListener(this);
        SaveI.addActionListener(this);

        edit.add(Cut);
        edit.add(Copy);
        edit.add(Paste);
        edit.add(Select);


        file.add(NewI);
        file.add(OpenI);
        file.add(SaveI);



        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(help);

        f.add(ta);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Cut){
            ta.cut();
        }
        if(e.getSource() == Copy){
            ta.copy();
        }
        if(e.getSource() == Paste){
            ta.paste();

        }
        if(e.getSource() == Select){
            ta.selectAll();
        }
        if(e.getSource() == bg){
            JColorChooser colorBox = new JColorChooser();
            Color c = colorBox.showDialog(f,"Select a color",Color.WHITE);
            ta.setBackground(c);

        }
        if(e.getSource() == fg){

            JColorChooser colorBox = new JColorChooser();
            Color c = colorBox.showDialog(f,"Select a color",Color.WHITE);
            ta.setForeground(c);

        }
        if(e.getSource() == NewI){
            ta.setText("");
            ta.setBackground(Color.WHITE);
        }
        if(e.getSource() == SaveI) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save");
            int option = fileChooser.showSaveDialog(f);
            if (option == JFileChooser.APPROVE_OPTION) {
                try {
                    File f = fileChooser.getSelectedFile();
                    String text = ta.getText();
                    FileWriter myw = new FileWriter(f);
                    myw.write(text);
                    myw.close();
                    System.out.println("Successful");
                } catch (Exception ex) {
                }
            }
        }
        else if(e.getSource() == OpenI){
        JFileChooser fileChooser = new JFileChooser();
        int Option = fileChooser.showOpenDialog(f);
        File f = fileChooser.getSelectedFile();
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                ta.append("\n" + sc.nextLine());
            }
        }catch (Exception ex){
            System.out.println(ex);
        }

        }

    }
}

public class Main {
    public static void main(String[] args) {
       NotePad notePad = new NotePad();

    }
}