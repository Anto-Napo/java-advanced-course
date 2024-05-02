package gra.swing;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //! All of this can be set here or in a new class.
        /*
        JFrame frame = new JFrame(); // Create the frame
        frame.setTitle("New JFrame app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //? Set what happens when the window is closed. See more options with autocompletion.
        frame.setResizable(false); // true by default
        frame.setSize(420, 420);

        ImageIcon image = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/icon.png"))); // Objects.requireNonNull() is not required, it's just safer.
        frame.setIconImage(image.getImage()); // Set an icon

        frame.getContentPane().setBackground(new Color(0,0,0)); //? Can also be set as Color.red, here it's RGBA or Hexadecimal (0xFFFFFF).

        frame.setVisible(true);
        */
        //!

        // MyFrame frame = new MyFrame();
        /* new FramesLabelsFrame(); */ //? Both methods can be used to create a frame.
        new FramesLabelsFrame(); // Frame, Text, Image
        new PanelsFrame(); // Container
        new ButtonsFrame();
        new LayoutsFrame(); // Behaviour of a container
        new LayeredPaneFrame(); // Depth
        new NewWindowFirstFrame();
        new OptionPaneFrame(); // PopUp
        new TextFieldFrame(); // Input
        new CheckboxFrame();
    }
}