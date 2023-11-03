import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyownUserFrame extends Frame
{
    Button b;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    String UID = "",Pwd= "",Status = " ";
    MyownUserFrame()
    {
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.setTitle("My own User Authentication");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });


        b = new Button("Login");
        l1 = new Label("User ID");
        l2 = new Label("Password");// These add the following GUI components to the display of the window
        t1 = new TextField(20);
        t2 = new TextField(20);

        Font f = new Font("comic",Font.BOLD + Font.ITALIC,20);
        b.setFont(f);
        l1.setFont(f);
        l2.setFont(f);
        t1.setFont(f);
        t2.setFont(f);
        t2.setEchoChar('*');

        this.add(l1);this.add(t1);
        this.add(l2);this.add(t2);
        this.add(b);

       b.addActionListener(ae ->{
           UID=t1.getText();
           Pwd=t2.getText();
           if(UID.equals("demoLogin") && Pwd.equals("GarbagePassword"))
           {
               Status = "Login Successful !!! Welcome back";
           }
           else {
               Status = "Wrong UserID or Password, Please enter the correct one.";
           }
           repaint();});
   }
   public void paint(Graphics g)
   {
       Font f = new Font("comic", Font.BOLD,20);
       g.setFont(f);
       g.drawString(Status,50,150);

   }
}
public class Self_Made_Authentication {
    public static void main(String[] args) {
        MyownUserFrame myFrame = new MyownUserFrame();
    }
}