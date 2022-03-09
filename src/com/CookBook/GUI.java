package com.CookBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {

        frame = new JFrame();

        JButton button = new JButton("Click");
        button.addActionListener(this);
        label = new JLabel("Nr of button clicked: 0");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 60, 10, 60));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Recipe Match");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Nr of button clicked: " + count);
    }
}
