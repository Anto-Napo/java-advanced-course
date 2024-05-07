package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame implements ActionListener {
    //? It creates a field where we can write some text
    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");
    TextFieldFrame() {
        //! Create a TextField
        textField.setPreferredSize(new Dimension(375, 60));
        //* Custom
        textField.setFont(new Font("Consolas", Font.PLAIN, 30));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white); //? The cursor
        textField.setText("food"); //? Default placeholder

        //! Create a button
        button.addActionListener(this);

        //! Default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Field");
        this.setLayout(new FlowLayout());

        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            textField.setEditable(false);
            button.setEnabled(false);
            String result = textField.getText();
            System.out.println(result);
        }
    }
}
