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
    private JPanel panelTop;
    private JButton buttonSync;
    private JButton buttonConfig;
    private JTable tableLdap;

    public Ldap() {
        buttonSync.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Sync...");
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
