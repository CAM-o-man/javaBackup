package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    boolean nameCalling = false;
    boolean fingerShaking = false;
    boolean yellingLoudly = false;
    boolean physicallyAttacking = false;
    String name;
    double fine = 0;
    private JPanel panel1;
    private JTextField nameField;
    private JRadioButton physicallyAttackingRadioButton;
    private JRadioButton nameCallingRadioButton;
    private JRadioButton fingerShakingRadioButton;
    private JRadioButton yellingLoudlyRadioButton;
    private JButton SUBMITButton;
    private JLabel jlabel1;

    public Main() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(physicallyAttackingRadioButton);
        buttonGroup.add(nameCallingRadioButton);
        buttonGroup.add(fingerShakingRadioButton);
        buttonGroup.add(yellingLoudlyRadioButton);


        physicallyAttackingRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                physicallyAttacking = true;
            }
        });
        yellingLoudlyRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yellingLoudly = true;
            }
        });
        fingerShakingRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fingerShaking = true;
            }
        });
        nameCallingRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameCalling = true;
            }
        });
        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean[] offenses = new boolean[4];
                offenses[0] = nameCalling;
                offenses[1] = fingerShaking;
                offenses[2] = yellingLoudly;
                offenses[3] = physicallyAttacking;

                if (nameCalling == true) {
                    fine += 49.95;
                }
                if (fingerShaking == true) {
                    fine += 99.95;
                }
                if (yellingLoudly == true) {
                    fine += 149.95;
                }
                if (physicallyAttacking == true) {
                    fine += 499.95;
                }
                if (fine >= 1000000) {
                    jlabel1.setText((nameField.getText() + " Has incurred a fine of an ungodly amount of money."));
                }
                jlabel1.setText((nameField.getText() + " has committed these crimes, and has incurred a fine of " + fine));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
