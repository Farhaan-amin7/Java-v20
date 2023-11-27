package Tick_Tac_Toe;



import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Tik_Tac_Toe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_Panel = new JPanel();
    JPanel button_Panel = new JPanel();
    JLabel TextField = new JLabel();
    JButton [] buttons = new JButton[9];
    boolean Player_1Turns;
    Tik_Tac_Toe() throws InterruptedException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setVisible(true);


        TextField.setBackground(new Color(25,25,25));
        TextField.setForeground(new Color(25,255,0));
        TextField.setFont(new Font("Helvetica", Font.PLAIN,75));
        TextField.setText("Tick Tac Toe");
        TextField.setOpaque(true);

        title_Panel.setLayout(new BorderLayout());
        title_Panel.setBounds(0,0,800,100);

        button_Panel.setLayout(new GridLayout(3,3));
        button_Panel.setBackground(new Color(144,25,36));

        for(int i=0;i<9;i++)
        {
            buttons[i] = new JButton();
            button_Panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.PLAIN,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }


        title_Panel.add(TextField);
        frame.add(title_Panel,BorderLayout.NORTH);
        frame.add(button_Panel);

        FirstTurn();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<9;i++)
        {
            if(e.getSource() ==buttons[i])
            {
                if (Player_1Turns)
                {
                    if(buttons[i].getText() == "")
                    {
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        Player_1Turns = false;
                        TextField.setText("O turn");
                        Check();

                    }
                }
                else{
                    if(buttons[i].getText() == "")
                    {
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        Player_1Turns = true;
                        TextField.setText("X turn");
                        Check();

                    }
                }
            }
        }

    }
    public void FirstTurn() throws InterruptedException {

       try{
           Thread.sleep(2000);
       }
       catch (InterruptedException e)
       {
           e.printStackTrace();
       }
        if(random.nextInt(2)==0)
        {
            Player_1Turns = true;
            TextField.setText("X Turn");
        }
        else {
            Player_1Turns = false;
            TextField.setText("O Turn");
        }
    }
    public void Check()
    {
        if(
        (buttons[0].getText() == "X")&&
        (buttons[1].getText() == "X")&&
        (buttons[2].getText() == "X")
    ) {
        XWins(0,1,2);
      }
        if(
                (buttons[3].getText() == "X")&&
                (buttons[4].getText() == "X")&&
                (buttons[5].getText() == "X")
        ) {
            XWins(3,4,5);
        }
        if(
                (buttons[6].getText() == "X")&&
                (buttons[7].getText() == "X")&&
                (buttons[8].getText() == "X")
        ) {
            XWins(6,7,8);
        }
        if(
                (buttons[0].getText() == "X")&&
                (buttons[3].getText() == "X")&&
                (buttons[6].getText() == "X")
        ) {
            XWins(0,3,6);
        }
        if(
                (buttons[1].getText() == "X")&&
                (buttons[4].getText() == "X")&&
                (buttons[7].getText() == "X")
        ) {
            XWins(1,4,7);
        }
        if(
                (buttons[2].getText() == "X")&&
                (buttons[5].getText() == "X")&&
                (buttons[8].getText() == "X")
        ) {
            XWins(2,5,8);
        }
        if(
                (buttons[0].getText() == "X")&&
                (buttons[4].getText() == "X")&&
                (buttons[8].getText() == "X")
        ) {
            XWins(0,4,8);
        }
        if(
                (buttons[2].getText() == "X")&&
                        (buttons[4].getText() == "X")&&
                        (buttons[6].getText() == "X")
        ) {
            XWins(2,4,6);
        }
        // Checkss for O wins.

        if(
                (buttons[0].getText() == "O")&&
                (buttons[1].getText() == "O")&&
                (buttons[2].getText() == "O")
        ) {
            OWins(0,1,2);
        }
        if(
                (buttons[3].getText() == "O")&&
                (buttons[4].getText() == "O")&&
                (buttons[5].getText() == "O")
        ) {
            OWins(3,4,5);
        }
        if(
                (buttons[6].getText() == "O")&&
                (buttons[7].getText() == "O")&&
                (buttons[8].getText() == "O")
        ) {
            OWins(6,7,8);
        }
        if(
                (buttons[0].getText() == "O")&&
                (buttons[3].getText() == "O")&&
                (buttons[6].getText()=="O")
        ) {
            OWins(0,3,6);
        }
        if(
                (buttons[1].getText() == "O")&&
                (buttons[4].getText() == "O")&&
                (buttons[7].getText() == "O")
        ) {
            OWins(1,4,7);
        }
        if(
                (buttons[2].getText() == "O")&&
                (buttons[5].getText() == "O")&&
                (buttons[8].getText() == "O")
        ) {
            OWins(2,5,8);
        }
        if(
                (buttons[0].getText() == "O")&&
                (buttons[4].getText() == "O")&&
                (buttons[8].getText() == "O")
        ) {
            OWins(0,4,8);
        }
        if(
                (buttons[2].getText() == "O")&&
                (buttons[4].getText() == "O")&&
                (buttons[6].getText() == "O")
        ) {
            OWins(2,4,6);
        }

    }
    public void XWins(int a, int b, int c)
    {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for(int i=0;i<9;i++)
        {
            buttons[i].setEnabled(false);
        }
        TextField.setText("X Wins");

    }
    public void OWins(int a, int b, int c)
    {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for(int i=0;i<9;i++)
        {
            buttons[i].setEnabled(false);
        }
        TextField.setText("O Wins");

    }
}