package com.compdog.csa.skillbuilding;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;

/**
 * This program displays two messages that
 * alternate every two seconds
 */
public class BannerAd extends JPanel
        implements ActionListener {

    /**
     * Array of messages to display
     * Switches to the next one every 2 seconds
     */
    private final String[] MESSAGES = new String[]{
            "East or West",
            "Java is Best"
    };

    /**
     * The current message to display.
     * Increments every 2 seconds, and wraps around
     * to 0 when the end of {@link #MESSAGES} is reached.
     */
    private int currentMessage = 0;

    // Called automatically after a repaint request
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Paint the background

        g.setColor(Color.RED);

        // Get bounds of the message to center the text
        Rectangle2D bounds = g.getFontMetrics().getStringBounds(MESSAGES[currentMessage], g);
        // Draw the message
        g.drawString(MESSAGES[currentMessage], getWidth() / 2 - (int) bounds.getWidth() / 2, getHeight() / 2);
    }

    // Called automatically when the timer "fires"
    public void actionPerformed(ActionEvent e) {
        if (++currentMessage >= MESSAGES.length) // Increment and wrap current message index
            currentMessage = 0;

        repaint();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Banner Ad");

        // Set this window's location and size:
        // upper-left corner at 300, 300; width 300, height 100
        window.setBounds(300, 300, 300, 100);

        //  Create panel, a BannerAd object, which is a kind of JPanel:
        BannerAd panel = new BannerAd();
        panel.setBackground(Color.CYAN);  // the default color is light gray

        // Add panel to window:
        Container c = window.getContentPane();
        c.add(panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // Create a Timer object that fires every 2 seconds;
        // attach it to panel so that panel "listens to" and
        // processes the timer events; start the timer:
        Timer clock = new Timer(2000, panel);
        clock.start();
    }
}