package frame.components;

import frame.AppFrame;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppStartPanel extends JPanel {

    private ButtonUtils buttonUtils;
    /**
     * 생성자
     * @param appFrame
     */
    public AppStartPanel(AppFrame appFrame) {
        setLayout(null);
        buttonUtils = new ButtonUtils();
        JButton start = buttonUtils.start(appFrame);
        JButton close = buttonUtils.close(appFrame);
        add(start);
        add(close);
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

