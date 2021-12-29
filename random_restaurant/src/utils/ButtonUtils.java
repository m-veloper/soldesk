package utils;

import constant.CategoryBtnCode;
import constant.PanelCode;
import frame.AppFrame;
import frame.components.AppCategoryPanel;
import frame.components.AppRandomPanel;
import frame.components.AppRandomResultPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import static constant.Constants.*;
import static constant.PanelCode.*;

public class ButtonUtils implements Button {

    private String globalStatus;

    @Override
    public JButton setTransparencyButton(String btnName, String imgPath, int x, int y, int width, int height) {
        JButton jButton = new JButton();
        if (!imgPath.isEmpty()) {
            Image image = new ImageIcon(imgPath).getImage();
            ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jButton.setIcon(imageIcon);
        }
        jButton.setActionCommand(btnName);
        jButton.setBounds(x, y, width, height);
        jButton.setBorderPainted(false);
        jButton.setFocusPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setOpaque(false);
        return jButton;
    }

    @Override
    public JButton runApp(AppFrame appFrame) {
        JButton runApp = this.setTransparencyButton(RUN_APP, APP_ICON_BTN, 30, 455, 95, 95);
        runApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), APP_START.getValue());
            }
        });
        return runApp;
    }

    @Override
    public JButton start(AppFrame appFrame) {
        JButton start = this.setTransparencyButton(START, APP_START_BTN, 75, 550, 250, 60);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), APP_MAIN.getValue());
            }
        });
        return start;
    }

    @Override
    public JButton close(AppFrame appFrame) {
        JButton close = this.setTransparencyButton(CLOSE, APP_CLOSE_BTN, 75, 620, 250, 60);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), APP_BASE.getValue());
            }
        });
        return close;
    }

    @Override
    public JButton goBack(AppFrame appFrame, PanelCode panelCode, String status) {
        JButton back = this.setTransparencyButton(GO_BACK, APP_GO_BACK_BTN, 50, 100, 80, 35);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (panelCode) {
                    case APP_MAIN:
                        appFrame.getCardLayout().show(appFrame.getContentPane(), APP_START.getValue());
                        break;
                    case APP_RANDOM:
                    case APP_CATEGORY:
                        appFrame.getCardLayout().show(appFrame.getContentPane(), APP_MAIN.getValue());
                        break;
                    case APP_RANDOM_RESULT:
                        // status 값이 따라 패널들의 설정을 다르게 보여줌
                        if (!status.isEmpty()){
                            appFrame.add(APP_RANDOM.getValue(), new AppRandomPanel(appFrame, status));
                            appFrame.getCardLayout().show(appFrame.getContentPane(), APP_RANDOM.getValue());
                        }
                        break;
                }
            }
        });
        return back;
    }

    @Override
    public JButton goRandom(AppFrame appFrame) {
        JButton random = this.setTransparencyButton(GO_RANDOM, APP_RANDOM_BTN, 45, 200, 300, 225);
        random.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                globalStatus = RANDOM_STATUS;
                appFrame.add(APP_RANDOM.getValue(), new AppRandomPanel(appFrame, globalStatus));
                appFrame.getCardLayout().show(appFrame.getContentPane(), APP_RANDOM.getValue());
            }
        });
        return random;
    }

    @Override
    public JButton goCategory(AppFrame appFrame) {
        JButton category = this.setTransparencyButton(GO_CATEGORY, APP_CATEGORY_BTN, 45, 435, 300, 225);
        category.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrame.add(APP_CATEGORY.getValue(), new AppCategoryPanel(appFrame));
                appFrame.getCardLayout().show(appFrame.getContentPane(), APP_CATEGORY.getValue());
            }
        });
        return category;
    }

    @Override
    public ArrayList<JButton> getCategoryBtnBtn(AppFrame appFrame) {
        ArrayList<JButton> country = new ArrayList<>();
        CategoryBtnCode.getCategoryInfo().stream().forEach(
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
                            globalStatus = s.getActionCommand();
                            appFrame.add(APP_RANDOM.getValue(), new AppRandomPanel(appFrame, globalStatus));
                            appFrame.getCardLayout().show(appFrame.getContentPane(), APP_RANDOM.getValue());
                        }
                    });
                }
        );
        return country;
    }

    @Override
    public JButton startRandom(AppFrame appFrame) {
        JButton startRandom = this.setTransparencyButton(START_RANDOM, APP_RANDOM_START_BTN, 80, 550, 230, 60);
        return startRandom;
    }

    @Override
    public void interruptRandomImgTread(Thread thread, JButton jButton, JLabel jLabel, AppFrame appFrame, String status) {
        // 타이머 객체 생성
        Timer timer = new Timer();
        // 타이머 시작
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                // 랜덤 결과를 생성할 패널 객체를 생성
                appFrame.getContentPane().add(APP_RANDOM_RESULT.getValue(), new AppRandomResultPanel(appFrame, status));
                // 랜덤 결과를 생성할 패널 객체 보여줌(show)
                appFrame.getCardLayout().show(appFrame.getContentPane(), APP_RANDOM_RESULT.getValue());
                // 작동중인 쓰레드 인터럽트 발생
                thread.interrupt();
                // 시작 버튼 활성화
                jButton.setEnabled(true);
                // 시작 버튼 보이게
                jButton.setVisible(true);
                // 라벨 버튼 안보이게
                jLabel.setVisible(false);
            }
        };
        timer.schedule(timerTask, 5000);
    }

    @Override
    public JButton openKakaoMap(String url) {
        JButton jButton = this.setTransparencyButton(OPEN_BROWSER, APP_SHOW_MAP_BTN, 80, 650, 250, 60);
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 브라우저 오픈.
                    Desktop.getDesktop().browse(new URI(url));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (URISyntaxException uriSyntaxException) {
                    uriSyntaxException.printStackTrace();
                }
            }
        });
        return jButton;
    }

    @Override
    public JButton openGit(String url) {
        JButton jButton = this.setTransparencyButton(OPEN_BROWSER, APP_GIT_BTN, 120, 700, 150, 25);
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 브라우저 오픈.
                    Desktop.getDesktop().browse(new URI(url));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (URISyntaxException uriSyntaxException) {
                    uriSyntaxException.printStackTrace();
                }
            }
        });
        return jButton; }
}
