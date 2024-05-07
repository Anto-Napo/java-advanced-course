package gra.swing;

import javax.swing.*;

public class Animated2DFrame extends JFrame {
    Animated2DPanel panel;
    Animated2DFrame() {
        panel = new Animated2DPanel();

        this.setTitle("2D animation");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
