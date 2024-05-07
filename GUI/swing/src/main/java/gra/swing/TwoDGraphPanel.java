package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class TwoDGraphPanel extends JPanel {
    TwoDGraphPanel() {
        this.setPreferredSize(new Dimension(750, 750));
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        /*
        g2D.setStroke(new BasicStroke(5)); //? Set the width
        g2D.setPaint(Color.blue);

        g2D.drawLine(0, 0, 750, 750); //? The latest component will overlap the component before it and so on

        g2D.setPaint(Color.pink); //? Override the previous color
        g2D.drawRect(0, 0, 150, 300);

        g2D.setPaint(Color.red);
        g2D.fillRect(0, 0, 150, 150);

        g2D.setPaint(Color.orange);
        g2D.drawOval(375, 375, 200, 200);
        g2D.fillOval(175, 175, 200, 200);

        g2D.setPaint(Color.yellow);
        int[] xPoints = {225, 375, 525};
        int[] yPoints = {450, 225, 450};
        g2D.fillPolygon(xPoints, yPoints, 3);
         */

        //! Random (but important)

        //! Image
        Image image = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/background.jpg"))).getImage();
        g2D.drawImage(image, 0, 0, null);

        //! Pokeball
        // Red arc
        // Gray arc
        // Black line
        // White circle
        // Black circle

        g2D.setStroke(new BasicStroke(5));

        g2D.setPaint(Color.red);
        g2D.fillArc(0, 0, 250, 250, 0, 180);

        g2D.setPaint(Color.white);
        g2D.fillArc(0, 0, 250, 250, 180, 180);

        g2D.setPaint(Color.black);
        g2D.drawLine(0, 125, 250, 125);

        g2D.setPaint(Color.white);
        g2D.fillOval(75, 75, 100, 100);

        g2D.setPaint(Color.black);
        g2D.drawOval(75, 75, 100, 100);

        g2D.setStroke(new BasicStroke(2));
        g2D.drawOval(88, 88, 74, 74);
    }
}
