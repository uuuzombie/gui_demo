package com.sky.demo.ldap;

import com.google.common.collect.Lists;
import com.sky.demo.ldap.model.ServerConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
                //Http interface

                List<ServerConfig> configList = Lists.newArrayList();


                //read from file
                List<ServerConfig> configFromFile = Lists.newArrayList();


                //merge list

                //show only unconfigured and self-config server


            }
        });

        buttonConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //if config new server, need to push to cloud

                //write to file

                JOptionPane.showMessageDialog(null, "Config...");
            }
        });
    }



    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Ldap");
        jFrame.setContentPane(new Ldap().panelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,500);
        jFrame.setPreferredSize(new Dimension(600,500));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();             //获取屏幕的尺寸
        int windowWidth = jFrame.getWidth();                     //获得窗口宽
        int windowHeight = jFrame.getHeight();                   //获得窗口高
        int screenWidth = screenSize.width;                      //获取屏幕的宽
        int screenHeight = screenSize.height;                    //获取屏幕的高
        jFrame.setLocation((screenWidth - windowWidth) / 2, (screenHeight - windowHeight) / 2);//设置窗口居中显示

        jFrame.pack();
        jFrame.setVisible(true);
    }
}
