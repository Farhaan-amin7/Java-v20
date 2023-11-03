import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseListenerImpl implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse clicked ["+ me.getX() + "," + me.getY()+"]");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Mouse Pressed ["+ me.getX() + "," + me.getY()+"]");

    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Mouse Released ["+ me.getX() + "," + me.getY()+"]");

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Mouse Entered ["+ me.getX() + "," + me.getY()+"]");

    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Mouse Exited ["+ me.getX() + "," + me.getY()+"]");

    }
}
class MyFrame2 extends Frame{
    MyFrame2()
    {
        this.setSize(500,500);
        this.setVisible(true);
        this.setBackground(Color.DARK_GRAY);
        this.setTitle("Mouse Listener Implementations");
        this.addMouseListener(new MouseListenerImpl());
    }
}
public class Mouse_Listener {
    public static void main(String[] args) {
  MyFrame2 mf = new MyFrame2();
    }
}