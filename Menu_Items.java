import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class userFrame1 extends Frame implements ActionListener{

    String item= " ";
    userFrame1()
    {
        this.setVisible(true);
        this.setTitle("Menu Examples");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GRAY);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        MenuBar mb = new MenuBar();
        this.setMenuBar(mb);
        Menu m = new Menu("File");
        mb.add(m);
        MenuItem mi1 = new MenuItem("New");
        MenuItem mi2 = new MenuItem("Open");
        MenuItem mi3 = new MenuItem("Save");
        MenuItem mi4 = new MenuItem("Save As");


        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        m.add(mi1);
        m.add(mi2);
        m.add(mi3);
        m.add(mi4);

    }
    public void actionPerformed(ActionEvent ae)
    {
        item = ae.getActionCommand();
        repaint();
    }
    public void paint (Graphics g){
        Font f = new Font("arial", Font.BOLD,30);
        g.setFont(f);
        g.drawString("Selected item :" + item ,50,300);
    }

}
public class Menu_Items {
    public static void main(String[] args) {
userFrame1 uf = new userFrame1();

    }
}