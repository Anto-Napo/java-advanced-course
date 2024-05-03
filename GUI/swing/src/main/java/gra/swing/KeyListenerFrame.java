package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

public class KeyListenerFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon rocketIcon;
    KeyListenerFrame() {
        //! Create a label
        label = new JLabel();
        label.setBounds(0, 0, 150, 150);
        label.setOpaque(false);
        rocketIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/rocket.png")));
        label.setIcon(rocketIcon);

        //! Default
        this.setTitle("Key listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLayout(null);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.black);

        this.add(label);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        //? When a key is typed, uses KeyChar, char output. Used when we want to capture actual characters.
        System.out.println("You typed key " + e.getKeyChar());
        final int MOVE = 10;
        switch (e.getKeyChar()) {
            case 'q' -> label.setLocation(label.getX() - MOVE, label.getY());
            case 'd' -> label.setLocation(label.getX() + MOVE, label.getY());
            case 's' -> label.setLocation(label.getX(), label.getY() + MOVE);
            case 'z' -> label.setLocation(label.getX(), label.getY() - MOVE);
            default -> {}
        }
    }

    //? Both use KeyCode
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("You pressed key " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key " + e.getKeyCode());
    }
}
