// Vlad, 9/11/2024, Find and fix the bug.
// Chapter 2 Question 15 (a)

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
public class RedCross extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        g.setColor(Color.RED);
        // The bug was the offset and size of the rectangles
        g.fillRect(xCenter - 5, yCenter - 50, 10, 100);
        g.fillRect(xCenter - 50, yCenter - 5, 100, 10);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Red Cross");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RedCross panel = new RedCross();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}