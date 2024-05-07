package gra.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class MenuBarFrame extends JFrame implements ActionListener {
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;
    MenuBarFrame() {
        //! Menu Bar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/load.png")));
        saveIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/save.png")));
        exitIcon = new ImageIcon(Objects.requireNonNull(Main.class.getResource("/exit.png")));

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        //! Keyboard shortcut
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h

        loadItem.setMnemonic(KeyEvent.VK_L); // Alt + l
        saveItem.setMnemonic(KeyEvent.VK_S); // Alt + l
        exitItem.setMnemonic(KeyEvent.VK_E); // Alt + l

        //! Default
        this.setTitle("MenuBar");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLayout(new FlowLayout());

        fileMenu.add(loadItem);
        loadItem.addActionListener(this);
        fileMenu.add(saveItem);
        saveItem.addActionListener(this);
        fileMenu.add(exitItem);
        exitItem.addActionListener(this);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem) {
            System.out.println("File loaded");
        }
        else if(e.getSource() == saveItem) {
            System.out.println("Saved");
        }
        else if(e.getSource() == exitItem) {
            System.out.println("Exiting");
            System.exit(0);
        }
    }
}
