package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Animated2DPanel extends JPanel implements ActionListener {
    //! Set up
    final int WIDTH = 750;
    final int HEIGHT = 750;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    Animated2DPanel() {
        //! Set up
        enemy = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/enemy.png"))).getImage();
        timer = new Timer(10, this);
        backgroundImage = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/space.png"))).getImage();

        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);

        timer.start(); //? Every second, the listener will be called
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); //? Will paint things set on the constructor (the black background here)

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(x > WIDTH - enemy.getWidth(null) || x < 0){
            xVelocity *= -1;
        }
        if(y > HEIGHT - enemy.getHeight(null) || y < 0) {
            yVelocity *= -1;
        }
        x += xVelocity;
        y += yVelocity;
        repaint();
    }
}
