package gra.swing;

import javax.swing.*;

public class TwoDGraphFrame extends JFrame {
    TwoDGraphPanel panel;
    TwoDGraphFrame() {
        //! Panel
        panel = new TwoDGraphPanel();

        //! Default
        this.setTitle("2D graph");
        this.setSize(750, 750);
        this.setLocationRelativeTo(null); //? Put the frame in the middle of the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
    //! The top bar is included in the frame size, so it's better to do that in a panel
    /*
    @Override
    public void paint(Graphics g) { //? This method is automatically called when we create a component
        Graphics2D g2D = (Graphics2D) g; //? Convert the outdated Graphic class to a newer version

        g2D.drawLine(0, 0, 750, 750); //? Create a line from the top left to the bottom right
    }
    */
}
