package frame.components;

import frame.AppFrame;
import service.RestaurantDB;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMainPanel extends JPanel {

    /**
     * 생성자
     * @param appFrameBase
     */
    public AppMainPanel(AppFrame appFrameBase) {
        setLayout(null);
        ButtonUtils buttonUtils = new ButtonUtils();
        JButton back = buttonUtils.back();
        JButton random = buttonUtils.random();
        JButton category = buttonUtils.category();

        add(back);
        add(random);
        add(category);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appStart");
            }
        });

        random.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appRandom");
            }
        });

        category.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appCategory");
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
        Image image = new ImageIcon("./random_restaurant/resources/img/app_panel.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

