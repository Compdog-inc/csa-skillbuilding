// Vlad, 9/11/2024, Show a solid black box moving from right to left across the window.

package com.compdog.csa.skillbuilding;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This program displays a solid black box that moves horizontally
 * across the window.
 */
public class Banner extends JPanel
        implements ActionListener {
    private int xPos, yPos;  // hold the coordinates of the box

    // Called automatically after a repaint request
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Paint the background
        g.setColor(Color.BLACK);
        g.fillRect(xPos, yPos - 25, 50, 50);
    }

    // Called automatically when the timer "fires"
    public void actionPerformed(ActionEvent e) {
        // Adjust the horizontal position of the box:
        xPos--;  // subtract 1
        if (xPos < -100)
            xPos = getWidth();

        repaint();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Action Demo");

        // Set this window's location and size:
        // upper-left corner at 300, 300; width 300, height 100
        window.setBounds(300, 300, 300, 100);

        //  Create panel, a Banner object, which is a kind of JPanel:
        Banner panel = new Banner();
        panel.setBackground(Color.CYAN);  // the default color is light gray

        // Add panel to window:
        Container c = window.getContentPane();
        c.add(panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // Set the initial position of the box:
        panel.xPos = panel.getWidth();
        panel.yPos = panel.getHeight() / 2;

        // Create a Timer object that fires every 30 milliseconds;
        // attach it to panel so that panel "listens to" and
        // processes the timer events; start the timer:
        Timer clock = new Timer(30, panel);
        clock.start();
    }
}