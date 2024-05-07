package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class CheckboxFrame extends JFrame implements ActionListener {
    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton();
    ImageIcon xIcon;
    ImageIcon vIcon;
    CheckboxFrame() {
        //! Create a checkbox
        checkBox.setText("I'm not a robot");
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        //* Icon
        xIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/x.png")));
        vIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/v.png")));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(vIcon);

        //! Create a button
        button.setText("Submit");
        button.addActionListener(this);

        //! Default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Checkbox");
        this.setLayout(new FlowLayout());

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            boolean isGood = checkBox.isSelected();
            System.out.println(isGood);
        }
    }
}
