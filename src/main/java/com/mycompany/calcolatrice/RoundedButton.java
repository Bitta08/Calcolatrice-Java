package com.mycompany.calcolatrice;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedButton extends JButton {
    private final int radius = 15; // Raggio dell'arrotondamento

    public RoundedButton(String label) {
        super(label);
        setContentAreaFilled(false); // Disabilita il disegno standard
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Colore di sfondo quando premuto o normale
        if (getModel().isPressed()) {
            g2.setColor(getBackground().darker());
        } else {
            g2.setColor(getBackground());
        }

        // Disegna l'area arrotondata
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), radius, radius));

        // Disegna il testo sopra
        super.paintComponent(g2);
        g2.dispose();
    }
}