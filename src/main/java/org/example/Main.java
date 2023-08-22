package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame jFrame = new JFrame("Calculatrice");
                jFrame.setSize(300, 400);
                jFrame.setContentPane(new Calculatrice().getContainer());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setVisible(true);
    }
});


    }
}