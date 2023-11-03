package DragAndDrop1;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();

    MyFrame()
    {
        this.setTitle("Drag and Drop Demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(dragPanel);
        this.setVisible(true);

    }
}