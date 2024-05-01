package gra.swing;

import javax.swing.*;
import java.awt.*;

public class LayeredPaneFrame extends JFrame {
    LayeredPaneFrame() {
        //? It's a container that provides a third dimension for positioning components (Z-index, depth)
        //? There are 5 depths (from bottom to top): Default (0), Palette (1), Modal (2), PopUp (3), Drag (4)

        //! Create JLayeredPane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 750, 750);

        //! Labels
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(75, 75, 300, 300);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(150, 150, 300, 300);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(225, 225, 300, 300);

        layeredPane.add(label1, Integer.valueOf(0)); //? Both put the labels in the default layer
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        //! Default
        this.setTitle("JLayeredPane");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLayout(null);

        this.add(layeredPane);
        this.setVisible(false);
    }
}
