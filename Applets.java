import java.applet.Applet;
import java.awt.*;
//import java.Applet;

class LogoApplet extends Applet {
    public void paint(Graphics g)
    {
        Font f = new Font("arial",Font.BOLD,30);
        g.setFont(f);
        g.drawString("Farhaan Amin Mir",100,100);
    }

}