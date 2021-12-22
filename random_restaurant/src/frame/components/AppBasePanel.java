package frame.components;

import frame.AppFrame;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppBasePanel extends JPanel {

    /**
     * 생성자
     * @param appFrame
     */
    public AppBasePanel(AppFrame appFrame) {
        setLayout(null);
        ButtonUtils buttonUtils = new ButtonUtils();
		JButton appIconBtn = buttonUtils.appIcon();
		add(appIconBtn);

        appIconBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrame.getCardLayout().show(appFrame.getContentPane(), "appStart");
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
        Image image = new ImageIcon("./random_restaurant/resources/img/base_img.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

