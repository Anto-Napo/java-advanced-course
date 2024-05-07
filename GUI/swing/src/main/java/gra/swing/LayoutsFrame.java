package gra.swing;

import javax.swing.*;
import java.awt.*;

public class LayoutsFrame extends JFrame {
    LayoutsFrame() {
        //? The Layout Manager defines the natural layout for components within a container
        //? There are 3 common managers:
        //? The BorderLayout: It places components in five areas: NORTH, SOUTH, WEST, EAST & CENTER. All extra space is placed in the center area.
        //? The FlowLayout: It places components in a row, sized at their preferred size. It's responsive horizontally by going to the next row.
        //? The GridLayout: It places components in a grid of cells. Each component takes all the available space within its cell. Each cell is the same size.

        //! Default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLayout(new GridLayout(5, 2)); //* Set the right layout
        //* All the next "this" will be commented because of the next layouts

        //! The BorderLayout
        //? If you want to set a margin: new BorderLayout(x, y)

        // -------- sup panels --------

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(150, 150)); //? Depending on the direction, one of the parameter will be useless.
        panel2.setPreferredSize(new Dimension(150, 150));
        panel3.setPreferredSize(new Dimension(150, 150));
        panel4.setPreferredSize(new Dimension(150, 150));
        panel5.setPreferredSize(new Dimension(150, 150));

        /*
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.WEST);
        this.add(panel3, BorderLayout.EAST);
        this.add(panel4, BorderLayout.SOUTH);
        this.add(panel5, BorderLayout.CENTER);
        */

        // -------- sub panels --------

        panel5.setLayout(new BorderLayout());

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel6.setPreferredSize(new Dimension(150, 150)); //? Depending on the direction, one of the parameter will be useless.
        panel7.setPreferredSize(new Dimension(150, 150));
        panel8.setPreferredSize(new Dimension(150, 150));
        panel9.setPreferredSize(new Dimension(150, 150));
        panel10.setPreferredSize(new Dimension(150, 150));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);

        //! The FlowLayout
        //? You can change the way it's flowing: new FlowLayout(FlowLayout.XXX). The default value is CENTER.
        //? You can also set a vertical and horizontal spacing: new FlowLayout(FlowLayout.XXX, x, y).

        JPanel flowPanel = new JPanel();
        flowPanel.setPreferredSize(new Dimension(375, 375));
        flowPanel.setBackground(Color.lightGray);
        flowPanel.setLayout(new FlowLayout()); //? FlowLayout by default

        flowPanel.add(new JButton("1"));
        flowPanel.add(new JButton("2"));
        flowPanel.add(new JButton("3"));
        flowPanel.add(new JButton("4"));
        flowPanel.add(new JButton("5"));
        flowPanel.add(new JButton("6"));
        flowPanel.add(new JButton("7"));
        flowPanel.add(new JButton("8"));
        flowPanel.add(new JButton("9"));
        flowPanel.add(new JButton("10"));

//        this.add(flowPanel);

        //! The GridLayout
        //? You can specify the amount of rows and columns: new GridLayout(rows, columns). If there are not enough rows or columns, it'll take a new column or row.
        //? You can also set a vertical and horizontal spacing: new GridLayout(rows, columns, x, y).

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        this.add(new JButton("10"));

        this.setVisible(false);
    }
}
