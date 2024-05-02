package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class RadioButtonFrame extends JFrame implements ActionListener {
    //? Buttons in a grouping in which only 1 can be selected per group.
    //? By default, we can select every button at once. We have to create a group.
    JRadioButton pizzaButton;
    ImageIcon pizzaIcon;

    JRadioButton hamburgerButton;
    ImageIcon hamburgerIcon;

    JRadioButton hotdogButton;
    ImageIcon hotdogIcon;
    RadioButtonFrame() {
        //! Create some Radio Buttons
        pizzaButton = new JRadioButton("pizza");
        pizzaButton.addActionListener(this);
        pizzaIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/pizza.png")));
        pizzaButton.setIcon(pizzaIcon);

        hamburgerButton = new JRadioButton("hamburger");
        hamburgerButton.addActionListener(this);
        hamburgerIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/hamburger.png")));
        hamburgerButton.setIcon(hamburgerIcon);

        hotdogButton = new JRadioButton("hotdog");
        hotdogButton.addActionListener(this);
        hotdogIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/hotdog.png")));
        hotdogButton.setIcon(hotdogIcon);

        //! Group
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        //! Default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton) {
            System.out.println("Here is your pizza");
        }
        else if(e.getSource() == hamburgerButton) {
            System.out.println("Here is your hamburger");
        }
        else if(e.getSource() == hotdogButton) {
            System.out.println("Here is your hotdog");
        }
    }
}
