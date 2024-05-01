package gra.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class OptionPaneFrame extends JFrame implements ActionListener {
    JButton button1 = new JButton("Message");
    JButton button2 = new JButton("Confirmation");
    JButton button3 = new JButton("Input");
    JButton button4 = new JButton("Question");
    OptionPaneFrame() {
        //? It's a popup that gives an information (error, warn...) or asks something to a user (yes, no, cancel)
        //? It has 5 types for messageDialog: PLAIN_MESSAGE, INFORMATION_MESSAGE, QUESTION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE
        //? For yes, no, cancel, it returns -1 if aborted, 0 if yes, 1 if no, 2 if cancel
        //? If you put it in a while true loop, it'll reopen when closed

        //! Create buttons
        button1.addActionListener(this);
        button1.setBounds(225, 240, 300, 60);

        button2.addActionListener(this);
        button2.setBounds(225, 300, 300, 60);

        button3.addActionListener(this);
        button3.setBounds(225, 360, 300, 60);

        button4.addActionListener(this);
        button4.setBounds(225, 420, 300, 60);

        //! Default
        this.setTitle("PopUp");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750, 750);

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            //! Create a JOptionPane to convey a message
            for(int i = 0; i < 3; i++) {
                JOptionPane.showMessageDialog(null, "YOU'VE BEEN HACKED!", "HACKING", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(e.getSource() == button2) {
            //! Create a JOptionPane to ask an information to a user
            int answer = JOptionPane.showConfirmDialog(null, "Do you like pizza?", "Pizza", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (answer) {
                case -1 -> System.out.println("Why :(");
                case 0 -> System.out.println("Cool");
                case 1 -> System.out.println("Not cool");
                case 2 -> System.out.println("Bruh...");
                default -> {}
            }
        }
        if(e.getSource() == button3) {
            String name = JOptionPane.showInputDialog(null, "What's your name?", "Input", JOptionPane.QUESTION_MESSAGE);
            System.out.println("Your name is " + name);
        }
        if(e.getSource() == button4) {
            String[] responses = {"No, you're awesome", "Thank you", "*blush*"};
            ImageIcon icon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/point.png")));

            int answer = JOptionPane.showOptionDialog(
                    null,
                    "You are awesome!",
                    "Awesome?",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    icon,
                    responses,
                    0
            );

            switch (answer) {
                case -1 -> System.out.println("Why :(");
                case 0 -> System.out.println("Thanks");
                case 1 -> System.out.println("You're welcome");
                case 2 -> System.out.println("WTF");
                default -> {}
            }
        }
    }
}
