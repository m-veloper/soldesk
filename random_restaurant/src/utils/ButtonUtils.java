package utils;

import constant.Country;
import frame.AppFrame;
import model.ButtonActionStatusDto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class ButtonUtils implements Button {

    @Override
    public JButton setTransparencyButton(String btnName, String imgPath, int x, int y, int width, int height) {
        JButton jButton = new JButton();
        if (imgPath != null) {
            Image image = new ImageIcon(imgPath).getImage();
            ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jButton.setIcon(imageIcon);
        }
        jButton.setBackground(Color.WHITE);
        jButton.setActionCommand(btnName);
        jButton.setBounds(x, y, width, height);
        jButton.setBorderPainted(false);
        jButton.setFocusPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setOpaque(true);
        return jButton;
    }

    @Override
    public JButton runApp(AppFrame appFrame) {
        JButton runApp = this.setTransparencyButton("runApp", "./random_restaurant/resources/img/app_icon.png", 46, 465, 62, 62);
        runApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), "appStart");
            }
        });
        return runApp;
    }

    @Override
    public JButton start(AppFrame appFrame) {
        JButton start = this.setTransparencyButton("start", "./random_restaurant/resources/img/start.png", 80, 550, 230, 50);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), "appMain");
            }
        });
        return start;
    }

    @Override
    public JButton close(AppFrame appFrame) {
        JButton close = this.setTransparencyButton("close", "./random_restaurant/resources/img/close.png", 80, 620, 230, 50);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), "appBase");
            }
        });
        return close;
    }

    @Override
    public JButton goBack(AppFrame appFrame, String fromPanel) {
        JButton back = this.setTransparencyButton("goBack", "./random_restaurant/resources/img/back.png", 50, 100, 80, 20);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (fromPanel) {
                    case "appMain":
                        appFrame.getCardLayout().show(appFrame.getContentPane(), "appStart");
                        break;
                    case "appRandom":
                        appFrame.getCardLayout().show(appFrame.getContentPane(), "appMain");
                        break;
                    case "appCategoryCommon":
                        appFrame.getCardLayout().show(appFrame.getContentPane(), "appCategory");
                        break;
                    case "appRandomResult":
                        appFrame.getCardLayout().show(appFrame.getContentPane(), "appRandom");
                        break;
                }
            }
        });
        return back;
    }

    @Override
    public JButton goRandom(AppFrame appFrame) {
        JButton random = this.setTransparencyButton("goRandom", "./random_restaurant/resources/img/random.png", 50, 175, 300, 225);
        random.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), "appRandom");
            }
        });
        return random;
    }

    @Override
    public JButton goCategory(AppFrame appFrame) {
        JButton category = this.setTransparencyButton("goCategory", "./random_restaurant/resources/img/category.png", 50, 425, 300, 225);
        category.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), "appCategory");
            }
        });
        return category;
    }

    @Override
    public ArrayList<JButton> getCountryBtn(AppFrame appFrame, ButtonActionStatusDto buttonActionStatusDto) {
        ArrayList<JButton> country = new ArrayList<>();
        StringBuilder panelName = new StringBuilder();
        Country.getCountry().stream().forEach(
                s -> {
                    country.add(this.setTransparencyButton(
                            s.get("name"),
                            s.get("categoryImgPath"),
                            Integer.parseInt(s.get("x")),
                            Integer.parseInt(s.get("y")),
                            Integer.parseInt(s.get("width")),
                            Integer.parseInt(s.get("height"))));
                }
        );


        country.stream().forEach(
                s -> {
                    s.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            panelName.append("app");
                            panelName.append(s.getActionCommand());
                            buttonActionStatusDto.setStatus(s.getActionCommand());
                            appFrame.getCardLayout().show(appFrame.getContentPane(), "appCategoryCommon");
                        }
                    });
                }
        );
        return country;
    }

    @Override
    public JButton startRandom(AppFrame appFrame) {
        JButton startRandom = this.setTransparencyButton("startRandom", "./random_restaurant/resources/img/start.png", 80, 550, 230, 50);
        return startRandom;
    }

    @Override
    public void interruptRandomImgTread(Thread thread, JButton jButton, AppFrame appFrame) {
        java.util.Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                appFrame.getCardLayout().show(appFrame.getContentPane(), "appRandomResult");
                thread.interrupt();
                jButton.setEnabled(true);
                jButton.setVisible(true);
            }
        };
        timer.schedule(timerTask, 5000);
    }


}
