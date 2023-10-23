import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class NewUser extends Frame implements ItemListener{
    Label l1,l2;
    List l;
    Choice ch;
    String utech = " ";
    String uprofession = " ";

    NewUser()
    {
        this.setVisible(true);
        this.setTitle("ListChoice Example");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GRAY);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        l1 = new Label("Technologies");
        l2 = new Label("profession");
        l =  new List(4,true);
        l.add("C");
        l.add("Java");
        l.add("C++");
        l.add("C#");
        l.addItemListener(this);

        ch = new Choice();
        ch.add("student");
        ch.add("Software engineer");
        ch.add("Unemployed");
        ch.add("Teacher");

        ch.addItemListener(this);
        Font f = new Font("arial", Font.BOLD,20);

        this.add(l1);this.add(l);
        this.add(l2);this.add(ch);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String [] items = l.getSelectedItems();
        for (String str: items)
        {
            utech = utech + str +" ";
        }
        uprofession = ch.getSelectedItem();
        repaint();
    }
    public void paint(Graphics g)
    {
        Font f = new Font("arial", Font.BOLD,30);
        g.setFont(f);
        g.drawString("User Techonologies   : " + utech ,50,300);
        g.drawString("User Profession   : " + uprofession ,50,350);
        utech = " ";

    }
}

public class New_ItemBox {
    public static void main(String[] args) {
        NewUser nw = new NewUser();
    }
}