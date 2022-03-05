package com.CookBook;

import javax.swing.*;
import java.awt.*;

public class Main {

    public GUI() {

        JFrame frame = new JFrame();


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Recipe Match");
    }


    public static void main(String[] args) {
        new GUI();

    }
}
