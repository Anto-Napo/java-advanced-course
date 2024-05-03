package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileSelectorFrame extends JFrame implements ActionListener {
    JButton button = new JButton("Select File");
    FileSelectorFrame() {
        button.addActionListener(this);
        //! Default
        this.setTitle("File selector");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(button);
        this.pack();
        this.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(".")); //? Set the default location

            int response = fileChooser.showOpenDialog(null); //? Select the file to open, returns 1 or 0

            if(response == JFileChooser.APPROVE_OPTION /* (0) */) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
