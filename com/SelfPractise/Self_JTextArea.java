package com.SelfPractise;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

class MyJTextArea implements ActionListener {  // Multi Line region that allows us to display text also allows us to edit multiple text lines.
    JTextArea textArea;
    JLabel label, label1;
    JButton button;
    JFrame frame;
    MyJTextArea()
    {
        frame = new JFrame("Self-Practise");
        frame.setDefaultCloseOperation(3);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(33, 1, 1));

        label = new JLabel();
        label.setLayout(null);
        label.setFont(new Font("MV Boli",Font.ITALIC,15));
        label.setBounds(150,20,100,50);

        label1 = new JLabel();
        label1.setLayout(null);
        label1.setBackground(Color.GREEN);
        label1.setFont(new Font("MV Boli",Font.ITALIC,15));
        label1.setBounds(300,20,200,50);

        button = new JButton("Count");
        button.setLayout(null);
        button.requestFocusInWindow();
        button.setBounds(20,300,100,50);
        button.addActionListener(this);

        textArea = new JTextArea("This is a textArea.",2,2);
        textArea.setLayout(null);
        textArea.setBounds(20,100,200,100);
        AbstractDocument document = (AbstractDocument) textArea.getDocument();
        document.setDocumentFilter(new LineInsertionFilter(10));

        frame.add(label);frame.add(label1);frame.add(textArea);frame.add(button);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        String Words [] = text.split("\\s");
        label.setText("words :" + (Words.length - 1));
        label1.setText("Characters:" + text.length());

    }
    private static class LineInsertionFilter extends DocumentFilter implements com.SelfPractise.LineInsertionFilter {
        private final int maxCharacters;

        LineInsertionFilter(int maxCharacters) {
            this.maxCharacters = maxCharacters;
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            super.replace(fb, offset, length, text, attrs);
            if (fb.getDocument().getLength() % (maxCharacters + 1) == 0) {
                fb.insertString(offset + length, "\n", attrs);
            }
        }
    }
}
public class Self_JTextArea {
    public static void main(String[] args) {
        new MyJTextArea();
    }
}