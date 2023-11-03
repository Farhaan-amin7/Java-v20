package DragAndDrop1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class DragPanel extends JPanel {
    ImageIcon imageIcon = new ImageIcon("D:\\java-programing\\java-programing\\src\\DragAndDrop1\\smile.png");
    final int width = imageIcon.getIconWidth();
    final int Height = imageIcon.getIconHeight();
    Point imageCorner;
    Point prevPt;
    DragPanel()
    {
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        imageIcon.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e)
        {
            Point currentPt = e.getPoint();

            imageCorner.translate(


                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY())

            );
            prevPt = currentPt;
            repaint();
        }
    }

}