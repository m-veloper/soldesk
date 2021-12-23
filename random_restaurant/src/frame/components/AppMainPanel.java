package frame.components;

import frame.AppFrame;
import service.RestaurantDB;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMainPanel extends JPanel {

    private ButtonUtils buttonUtils;
    /**
     * 생성자
     * @param appFrame
     */
    public AppMainPanel(AppFrame appFrame) {
        setLayout(null);
        buttonUtils = new ButtonUtils();
        JButton back = buttonUtils.goBack(appFrame, "appMain");
        JButton random = buttonUtils.goRandom(appFrame);
        JButton category = buttonUtils.goCategory(appFrame);

        add(back);
        add(random);
        add(category);
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

