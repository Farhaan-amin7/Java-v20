import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;
class Myframe1 extends Frame {
    Myframe1() {
    this.setSize(500,500);
    this.setVisible(true);
    this.setBackground(Color.DARK_GRAY);
    this.setTitle("Window Listener Implementations");
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
    }
}
public class Event_Handling {
    public static void main(String[] args) {
        Myframe1 mf = new Myframe1();

    }
}