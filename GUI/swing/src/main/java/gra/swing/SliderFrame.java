package gra.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderFrame extends JFrame implements ChangeListener {
    JPanel panel;
    JLabel label;
    JSlider slider;
    SliderFrame() {
        //! Setup
        this.setTitle("Slider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 32); //? min, max, start_value

        //! Slider
        slider.setPreferredSize(new Dimension(600, 300));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10); //? Shows tick marks and the spacing
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true); //? Shows the values
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));

        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);

        //! Label text
        label.setText("C\u00B0 = " + slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        //! Default
        this.setSize(630, 630);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(label);
        panel.add(slider);
        this.add(panel);
        this.setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C\u00B0 = " + slider.getValue());
    }
}
