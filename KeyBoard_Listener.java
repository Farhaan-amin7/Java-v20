import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//class KeyListenerImpl implements KeyListener {
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//        System.out.println("Key Typed :" + e.getKeyChar());
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        System.out.println("Key Pressed :" + e.getKeyChar()); //getKeyCharis predefined methods.
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        System.out.println("Key Released :" + e.getKeyChar());
//
//    }
//}
    class MyFrame3 extends Frame{
    MyFrame3()
    {
        this.setSize(500,500);
        this.setVisible(true);
        this.setBackground(Color.DARK_GRAY);
        this.setTitle("Keyboard Listener Implementations");
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed :" + e.getKeyChar());

            }

            @Override
            public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed :" + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
        System.out.println("Key Released  :" + e.getKeyChar());
            }
        });
    }
    }

public class KeyBoard_Listener {
    public static void main(String[] args) {
        MyFrame3 mf = new MyFrame3();
    }
}