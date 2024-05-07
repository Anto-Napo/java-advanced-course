package gra.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Objects;

public class FramesLabelsFrame extends JFrame {
    FramesLabelsFrame() {
        //! Frame (GUI window to add components to)
        // Misc
        this.setTitle("New JFrame app");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //? Set what happens when the window is closed. See more options with autocompletion.
        this.setResizable(true); // true by default
        this.setSize(420, 420);
        this.getContentPane().setBackground(new Color(255,255,255)); //? Can also be set as Color.red, here it's RGBA or Hexadecimal (0xFFFFFF).

        // Icon
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/icon.png"))); //* Objects.requireNonNull() is not required, it's just safer.
        this.setIconImage(icon.getImage()); // Set an icon

        //! Labels (GUI display area for text or/and image.)
        JLabel label = new JLabel();

        // Text
        label.setText("That's good stuff");
        label.setForeground(Color.black); // color
        label.setFont(new Font("Arial", Font.PLAIN, 20)); //? Font(family, type, size)

        // Image
        ImageIcon image = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/drake.jpg")));
        label.setIcon(image);

        //Text & Image
        label.setHorizontalTextPosition(JLabel.CENTER); //? Places the text LEFT / CENTER / RIGHT of the image.
        label.setVerticalTextPosition(JLabel.TOP); //? TOP / CENTER / BOTTOM
        label.setIconTextGap(-25); //? Change the space between the image and the text

        // All
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        Border border = BorderFactory.createLineBorder(Color.yellow, 3); //? Border(color, thickness)
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        /* this.setLayout(null);
        label.setBounds(0, 0, 250, 250); */ //? Bounds(x, y, width, height), absolute position, so it shouldn't be used.

        this.add(label); // Add the label to the frame
        this.pack(); //? Makes the frame fit perfectly with the layouts into it.

        //! Set visible
        this.setVisible(false);
    }
}
