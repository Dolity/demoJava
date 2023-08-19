package com.dlt.demoJava;

import com.dlt.demoJava.helpers.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Harn Gun Jon Jer");
        frame.setSize(300, 300);
        frame.setLayout(null);


        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(20, 20, 250, 50);
        frame.add(inputTextField);

        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(20, 175, 500, 60);
        frame.add(outputLabel);

        JButton button = new JButton("OK");
        button.setBounds(20, 100, 250, 60);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextField.getText();
                int inputNumber = Integer.parseInt(inputText);
                String output = Calculator.getDivisibleOutput(inputNumber);
                outputLabel.setText(output);
            }
        });
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}