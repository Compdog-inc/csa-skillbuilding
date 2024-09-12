// Vlad, 9/11/2024, Program that displays a target

package com.compdog.csa.skillbuilding;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This program displays a red cross on a white
 * background.
 */
public class RedTarget extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        // Big red circle
        g.setColor(Color.RED);
        g.fillOval(xCenter - 155 / 2, yCenter - 155 / 2, 155, 155);

        // Fill middle of circle white to make it appear hollow
        g.setColor(Color.WHITE);
        g.fillOval(xCenter - 50, yCenter - 50, 100, 100);

        // Fill center red circle
        g.setColor(Color.RED);
        g.fillOval(xCenter - 55 / 2, yCenter - 55 / 2, 55, 55);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Red Target");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RedTarget panel = new RedTarget();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}