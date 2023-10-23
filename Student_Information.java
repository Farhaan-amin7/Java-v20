import java.awt.*;
import java.awt.event.*;

class RegistrationFrame extends Frame{
    Label l1,l2,l3,l4;
    TextField tf1,tf2,tf3;
    TextArea ta;
    Button b;
    String sid= "",Sname= "", squal= "", saddar = "";

    RegistrationFrame()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("Registration Frame");
        this.setBackground(Color.GRAY);
        this.setLayout(new FlowLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        l1 = new Label("Student ID");
        l2 = new Label("Student Name");
        l3 = new Label("Student Qualification");
        l4 = new Label("Student Address");

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        ta = new TextArea(5,20);
        b = new Button("Registration");
        b.addActionListener(ae -> {// Again used lamda expression in this program and before this we used the old method
            sid = tf1.getText();
            Sname = tf2.getText();
            squal = tf3.getText();
            saddar  = ta.getText();
            repaint();
        });

        Font f = new Font("arail", Font.ITALIC,25);
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);
        ta.setFont(f);
        b.setFont(f);

        this.add(l1);this.add(tf1);
        this.add(l2);this.add(tf2);
        this.add(l3);this.add(tf3);
        this.add(l4);this.add(ta);
        this.add(b);
    }
    public void paint(Graphics g)
    {
        Font f = new Font("arial",Font.ITALIC,20);
        g.setFont(f);
        g.drawString("Student ID             :"+sid , 50,300);
        g.drawString("Student Name           :"+Sname , 50,350);
        g.drawString("Student Qualification  :"+squal , 50,400);
        g.drawString("Student Address        :"+saddar , 50,450);

    }

}
public class Student_Information {
    public static void main(String[] args) {
        RegistrationFrame registration = new RegistrationFrame();

    }
}