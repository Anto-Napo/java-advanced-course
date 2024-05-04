package gra.swing;

import javax.swing.*;

public class DragDropFrame extends JFrame {
    DragDropPanel panel = new DragDropPanel();
    DragDropFrame() {
        //! Default
        this.setTitle("Drag & drop");
        this.setSize(900, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.setVisible(true);
    }
}
