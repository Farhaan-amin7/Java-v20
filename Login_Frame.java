import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class LoginFrame extends Frame{
    Label l1,l2;
    TextField tf1,tf2;
    Button b1;

    String Status = " ";

    LoginFrame()
    {
        this.setVisible(true);
        this.setTitle("Login Frame");
        this.setBackground(Color.GRAY);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        l1 = new Label("User Name");
        l2 = new Label("Password");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf2.setEchoChar('*');
        b1 = new Button("Login");
        b1.addActionListener(ae ->{// This is with lamda expressions and before this we didi it with ActionListener.
            String uname = tf1.getText();
            String upwd = tf2.getText();

            if(uname.equals("FarhaanAminMir") && upwd.equals("Farhaanamin@199"))
            {
                Status = "SUCCESS, Welcome!!!";

            }
            else {
                Status = "FAILURE, Try again.";
            }
            repaint();

        });

        Font f = new Font("arial", Font.BOLD,25);
        l1.setFont(f);
        l2.setFont(f);
        tf1.setFont(f);
        tf2.setFont(f);
        b1.setFont(f);

        this.add(l1);this.add(tf1);
        this.add(l2);this.add(tf2);
        this.add(b1);
    }

    public void paint(Graphics g)
    {
        Font f = new Font("arial", Font.BOLD,35);
        g.setFont(f);
        this.setForeground(Color.red);
        g.drawString("Login Status :"+ Status, 50,300 );
    }
}
public class Login_Frame {
    public static void main(String[] args) {
        LoginFrame g1= new LoginFrame();

    }
}