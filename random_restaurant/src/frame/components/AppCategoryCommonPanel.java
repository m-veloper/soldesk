package frame.components;

import frame.AppFrame;
import model.ButtonActionStatusDto;
import service.RestaurantDB;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppCategoryCommonPanel extends JPanel {

    private  ButtonUtils buttonUtils;
    /**
     * 생성자
     * @param appFrame
     * @param restaurantDB
     */
    public AppCategoryCommonPanel(AppFrame appFrame, RestaurantDB restaurantDB, ButtonActionStatusDto buttonActionStatusDto) {
        setLayout(null);
        buttonUtils = new ButtonUtils();
        appFrame.getClass().getName();

        JButton back = buttonUtils.goBack(appFrame, "appCategoryCommon");
        JButton startRandom = buttonUtils.startRandom(appFrame);

        add(back);
        add(startRandom);

        startRandom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(buttonActionStatusDto.getStatus());
            }
        });
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

