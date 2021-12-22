package frame.components;

import service.RestaurantDB;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppCategoryPanel extends JPanel {

    /**
     * 생성자
     *
     * @param
     * @param appFrameBase
     */
    public AppCategoryPanel(AppFrame appFrameBase, RestaurantDB restaurantDB) {

        setLayout(null);
        ButtonUtils buttonUtils = new ButtonUtils();

        JButton back = buttonUtils.back();

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appMain");
            }
        });

        add(back);
    }


    /**
     * 패널 배경 이미지 넣기
     * background 를 그려준다
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("./random_restaurant/resources/img/app_panel.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

