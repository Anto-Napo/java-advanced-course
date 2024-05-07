package gra.swing;

import javax.swing.*;
import java.awt.*;

public class NewWindowSecondFrame extends JFrame {
    NewWindowSecondFrame() {
        //! Create a label
        JLabel label = new JLabel("Hello World!");
        label.setBounds(0, 0, 500, 50);
        label.setFont(new Font("Arial", Font.PLAIN, 25));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //! Default
        this.setTitle("First window");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750, 750);

        this.add(label);
        this.setVisible(true);
    }
}
