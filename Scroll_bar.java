import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class UserFrame6 extends Frame implements AdjustmentListener{

    Scrollbar sb;
    int position;
    UserFrame6 ()
    {
        this.setVisible(true);
        this.setTitle("Scrollbar Examples");
        this.setSize(500,500);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.GRAY);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        sb = new Scrollbar(Scrollbar.VERTICAL);
        sb.addAdjustmentListener(this);
        this.add(BorderLayout.EAST,sb);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        position = sb.getValue();
        repaint();
    }
    public void paint (Graphics g)
    {
        Font f = new Font("arial",Font.BOLD,30);
        g.setFont(f);
        g.drawString("Postition  :"+ position , 50,300);
    }
}
 class Scroll_bar {
    public static void main(String[] args) {
        UserFrame6 ff = new UserFrame6();

    }
}