 import java.awt.*;
class Myframe extends Frame {

    Myframe() {
        this.setForeground(Color.GRAY);
        this.setVisible(true);
        this.setBackground(Color.GRAY);
        this.setSize(1000, 1000);
        this.setTitle("First Frame");
        }

    public void paint(Graphics g) {
        Font font = new Font("monospaced", Font.ITALIC, 35);
        g.setFont(font);
        this.setForeground(Color.GREEN);
        g.drawString("Draw String method prints the String on the frame we have created", 100, 100);
        g.drawString("Second Time using drawString", 100, 200);

    }
}
 public class Frames_first {
    public static void main(String[] args) {
        Myframe frame = new Myframe();


    }
}