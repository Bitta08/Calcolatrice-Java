package com.mycompany.calcolatrice;

import javax.swing.SwingUtilities;

public class Calcolatrice {

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        GUI graf = new GUI();
        graf.setTitle("Calcolatrice");
        graf.setResizable(false);
        graf.setVisible(true);
    });
}
}
