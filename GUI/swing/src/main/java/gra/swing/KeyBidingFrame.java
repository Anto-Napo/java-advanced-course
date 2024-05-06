package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class KeyBidingFrame extends JFrame {
    //? Compared to key listener, this doesn't need focusing on a component.
    //? It gives more flexibility
    //? But it's more difficult to set up
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    KeyBidingFrame() {
        //! Label
        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(150, 150, 150, 150);
        label.setOpaque(true);

        //! Actions
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction"); //? Set the keybinding
        label.getActionMap().put("upAction", upAction); //? Set the action done by the keybinding

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        //? If you want to put a single character, write it between single quotes (') these are arrow keys

        //! Default
        this.setTitle("Key Biding");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(610, 610);
        this.setLayout(null);

        this.add(label);
        this.setVisible(false);
    }
    public class UpAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }
    public class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }
    public class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }
    public class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
