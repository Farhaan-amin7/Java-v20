import java.awt.*;
import java.awt.event.*;

class UserFrame extends Frame implements ItemListener {

    Label l1,l2;
    Checkbox c1,c2,c3,c4,c5;

    String uqual = " ";
    String ugender = " ";

    UserFrame()
    {
        this.setVisible(true);
        this.setTitle("User Frame");
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GREEN);
        this.setSize(500,500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        l1 = new Label("Qualifiction");
        l2 = new Label("User Gender");
        c1 = new Checkbox("BSC",null,false);
        c2 = new Checkbox("MCA",null,false);
        c3 = new Checkbox("B.TECH",null,false);
        CheckboxGroup cg = new CheckboxGroup();
        c4 = new Checkbox("Male",cg,false);
        c5 = new Checkbox("Female",cg,false);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);

        this.add(l1);this.add(c1);this.add(c2);this.add(c3);
        this.add(l2);this.add(c4);this.add(c5);

        Font f = new Font("arial", Font.ITALIC,20);

        l1.setFont(f);
        l2.setFont(f);
        c5.setFont(f);
        c1.setFont(f);
        c2.setFont(f);
        c3.setFont(f);
        c4.setFont(f);

    }
    public void itemStateChanged(ItemEvent Ie)
    {
        if(c1.getState()== true)
        {
           uqual += c1.getLabel() + ",";
        }
        if(c2.getState() == true)
        {
            uqual += c2.getLabel() + ",";
        }
        if(c3.getState()== true)
        {
           uqual += c3.getLabel() + ",";
        }
        if(c4.getState() == true)
        {
            ugender = c4.getLabel();
        }
        if(c5.getState() == true)
        {
            ugender = c5.getLabel();
        }
        repaint();
    }
        public void paint(Graphics g)
        {
            Font f = new Font("arial",Font.ITALIC,20);
            g.setFont(f);
            g.drawString("Qualifications     :" + uqual,50,300);
            g.drawString("User Gender        :" + ugender,50,350);
            uqual = "";
        }
}
public class CheckBoxes{
    public static void main(String[] args) {
        UserFrame userframe = new UserFrame();
    }
}