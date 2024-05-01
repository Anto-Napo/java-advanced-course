package gra.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindowFirstFrame extends JFrame implements ActionListener {
    JButton button = new JButton();
    NewWindowFirstFrame() {
        button.setText("Open A New Window");
        button.setBounds(225, 240, 300, 60);
        button.setFocusable(false);
        button.addActionListener(this);

        //! Default
        this.setTitle("First window");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750, 750);

        this.add(button);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            new NewWindowSecondFrame();
//            this.setVisible(false);
            this.dispose(); //? Properly close the window
        }
    }
}
