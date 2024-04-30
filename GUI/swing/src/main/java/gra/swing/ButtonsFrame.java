package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ButtonsFrame extends JFrame implements ActionListener { //? Uses ActionListener so it enables it to make something
    JButton button = new JButton("Click me"); //? Set it here so it's enabled globally
    JLabel label = new JLabel();

    ButtonsFrame() {
        //! Create button
        ImageIcon pointer = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/point.png")));

        button.setLayout(new BorderLayout());
        button.setBounds(175, 200, 400, 200);
        button.addActionListener(this); //? Implement the ActionListener to the frame
        //? You can also use a lambda expression:
        //* button.addActionListener(e -> System.out.println("Hey"))

        button.setIcon(pointer);
        button.setFocusable(false); //? To remove the border around the text
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-10);

        button.setForeground(Color.blue);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());

        button.setEnabled(true); //? Make the button usable or unusable

        //! Create label
        label.setIcon(pointer);
        label.setText("You're there");
        label.setBounds(0, 0, 150, 150);
        label.setVisible(false);

        //! Default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //? Can use this instead of creating a JFrame
        this.setLayout(null);
        this.setSize(750, 750);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    //! Set the action done
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Hey");
            label.setVisible(true);
            button.setEnabled(false);
        }
    }
}
