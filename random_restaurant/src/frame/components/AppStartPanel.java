package frame.components;

import frame.AppFrame;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppStartPanel extends JPanel {

    /**
     * 생성자
     * @param appFrameBase
     */
    public AppStartPanel(AppFrame appFrameBase) {
        setLayout(null);
        ButtonUtils buttonUtils = new ButtonUtils();
        JButton start = buttonUtils.start();
        JButton close = buttonUtils.close();
        add(start);
        add(close);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appMain");
            }
        });

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appBase");
            }
        });
    }

    /**
     * 패널 배경 이미지 넣기
     * background 를 그려준다
     * @param g
     */
    @Override
    public void paintComponent(Graphics g){
        Image image = new ImageIcon("./random_restaurant/resources/img/app_start_panel.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

