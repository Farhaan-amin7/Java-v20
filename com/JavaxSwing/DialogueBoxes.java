package com.JavaxSwing;

import javax.swing.*;

public class DialogueBoxes {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"This is some useless information","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is  information","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This should be some Question Message","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is some useless information","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is some Error Message","title",JOptionPane.ERROR_MESSAGE);
//        System.out.println(JOptionPane.showConfirmDialog(null,"Bro, Do you even code!","This is a title",JOptionPane.YES_NO_CANCEL_OPTION));
//        String Name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println(Name);
        String [] responses = {"No, You're awesome.","ThankYou","Blush"};
        JOptionPane.showOptionDialog(null,"You are awesome","Secret Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,responses,0);

    }


}