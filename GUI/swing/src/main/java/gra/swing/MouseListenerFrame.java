package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerFrame extends JFrame implements MouseListener {
    JLabel label;
    MouseListenerFrame() {
        //! Label
        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(0, 0, 225, 225);
        label.addMouseListener(this);
        label.setOpaque(true);

        //! Default
        this.setTitle("Mouse listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLayout(null);

        this.add(label);
        this.setVisible(false);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //? Pressed and released. If it's only pressed or released, it'll not trigger
        System.out.println("Clicked");
        label.setBackground(Color.red);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //? Pressed
        System.out.println("Pressed");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //? Released
        System.out.println("Released");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //? Enters a component
        System.out.println("Entered");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //? Exits a component
        System.out.println("Exited");
        label.setBackground(Color.pink);
    }
}
