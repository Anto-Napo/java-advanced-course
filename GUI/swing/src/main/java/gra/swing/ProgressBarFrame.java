package gra.swing;

import javax.swing.*;
import java.awt.*;

public class ProgressBarFrame extends JFrame {
    //? Visual aid to let a user know that an operation is in progress
    JProgressBar progressBar = new JProgressBar(0, 100);
    ProgressBarFrame() throws InterruptedException {
        //! Progress Bar
        progressBar.setBounds(0, 0, 610, 75);
        progressBar.setFont(new Font("MV Boli", Font.PLAIN, 35));
        progressBar.setBackground(Color.red);
        progressBar.setForeground(Color.black);

        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        //! Default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(610, 610);
        this.setLayout(null);

        this.add(progressBar);
        this.setVisible(false);

        fill();
    }

    public void fill() throws InterruptedException {
        int progress = 100;
        while(progress >= 0) {
            progressBar.setValue(progress);
            Thread.sleep(50);
            progress--;
        }
        progressBar.setString("Done :)");
    }
}
