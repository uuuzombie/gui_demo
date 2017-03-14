package com.sky.demo.ldap.ui;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import com.google.common.collect.Lists;
import com.sky.demo.ldap.model.ServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.UUID;

/**
 * Created by user on 17/2/9.
 */
public class Tool {

    private static final Logger logger = LoggerFactory.getLogger(Tool.class);

    private JPanel panelMain;
    private JPanel panelTop;
    private JButton buttonSync;
    private JButton buttonConfig;
    private JTable tableLdap;

    public Tool() {

        DefaultTableModel model = initTableModel();

        buttonSync.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("click sync...");
                //Http interface

                List<ServerConfig> configList = Lists.newArrayList();
                ServerConfig config1 = new ServerConfig();
                config1.setId(1);
                config1.setName("config1");
                config1.setUuid(UUID.randomUUID().toString());
                config1.setType(1);
                config1.setHost("192.168.100.100");
                config1.setPort(389);
                config1.setRootContext("root");
                config1.setUserDn("userDn");


                model.addRow(new Object[] {config1.getId(), config1.getName(), config1.getUuid(), config1.getType(), config1.getHost(),
                        config1.getPort(), config1.getRootContext()});

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

    private DefaultTableModel initTableModel() {
        tableLdap.setAutoCreateRowSorter(true);
        tableLdap.setFillsViewportHeight(true);
        tableLdap.setPreferredScrollableViewportSize(new Dimension(550, 200));

        String[] columnNames = new String[]{"ID", "NAME", "UUID", "USED", "HOST", "PORT", "TYPE", "STATUS"};
        Object[][] cellDatas = null;
        DefaultTableModel model = new DefaultTableModel(cellDatas, columnNames);
        tableLdap.setModel(model);
        return model;
    }


    public static void main(String[] args) {

        //load logback in jar,the log file will be empty!!
        //java -Dlogback.configurationFile=logback.xml -jar gui_demo-jar-with-dependencies.jar
//        loadLogConifg();
//        logger.info("load config....");


        JFrame jFrame = new JFrame("Tool");
        jFrame.setContentPane(new Tool().panelMain);
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

    //jar
    private static void loadLogConifg() {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(context);

        context.reset();
        try {
            configurator.doConfigure("logback.xml");
        } catch (JoranException e) {
            logger.error("load log back config error", e);
        }
    }
}
