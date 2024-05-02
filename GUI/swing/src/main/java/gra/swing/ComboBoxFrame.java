package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxFrame extends JFrame implements ActionListener {
    JComboBox<String> comboBox;
    ComboBoxFrame() {
        //! Create a combo box
        String[] animals = {"Dog", "Cat", "Sheep", "Bird"};
        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);

        comboBox.insertItemAt("Mouse", 0);
        comboBox.setSelectedIndex(0); //? By default, the index selected will be the first item in the original array.

        comboBox.removeItem("Cat");
        comboBox.removeItemAt(0);

//        comboBox.removeAll();

        //! Default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Combo boxes");
        this.setLayout(new FlowLayout());

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
