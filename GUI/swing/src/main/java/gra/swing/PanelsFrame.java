package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class PanelsFrame extends JFrame {
    PanelsFrame() {
        //! Create panels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0 /* Left */, 0 /* Top */, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout()); //? Just to be able to align the label (Cf. layout)

        //! Create a label
        ImageIcon thumbsup = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/thumbsup.png")));

        JLabel thumb = new JLabel();
        thumb.setText("That's cool");
        thumb.setIcon(thumbsup);
        thumb.setVerticalAlignment(JLabel.CENTER);
        thumb.setHorizontalAlignment(JLabel.LEFT);
        //* If you want to set bounds, just use the null layout manager, otherwise, use the border one just like here.

        //! Default
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        greenPanel.add(thumb);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
