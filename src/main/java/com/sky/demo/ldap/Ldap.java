package com.sky.demo.ldap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 17/2/9.
 */
public class Ldap {
    private JPanel panelMain;
    private JButton buttonAdd;
    private JButton buttonLast;
    private JButton buttonConfig;
    private JButton buttonTiming;
    private JButton buttonNext;
    private JButton buttonSync;

    public Ldap() {
        buttonSync.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Sync...");
            }
        });

        buttonConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }




    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Ldap");
        jFrame.setContentPane(new Ldap().panelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,500);
        jFrame.setPreferredSize(new Dimension(600,500));
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
