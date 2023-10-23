import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ColorFrame extends Frame implements ActionListener{
    Button b1,b2,b3;
    ColorFrame()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("Button Examples");
        this.setLayout(new FlowLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        b1 = new Button("Red");
        b2 = new Button("Gray");
        b3 = new Button("Green");

        b1.setBackground(Color.RED);
        b2.setBackground(Color.GRAY);
        b3.setBackground(Color.GREEN);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        this.add(b1); // ->  add helps us to attach the buttons to the screen or frame.
        this.add(b2);
        this.add(b3);


    }
    public void actionPerformed(ActionEvent ae)
    {
        String NameButton = ae.getActionCommand();
        if(NameButton.equals("Red"))
        {
            this.setBackground(Color.RED);
        }
        if(NameButton.equals("Gray"))
        {
            this.setBackground(Color.GRAY);
        }
        if(NameButton.equals("Green"))
        {
            this.setBackground(Color.GREEN);
        }


    }
}
public class Button_Examples {
    public static void main(String[] args) {
        ColorFrame cf = new ColorFrame();


    }
}