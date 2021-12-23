package frame.components;

import frame.AppFrame;
import model.ButtonActionStatusDto;
import service.RestaurantDB;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppRandomResultPanel extends JPanel {

    private  ButtonUtils buttonUtils;
    /**
     * 생성자
     * @param appFrame
     * @param restaurantDB
     */
    public AppRandomResultPanel(AppFrame appFrame, RestaurantDB restaurantDB) {
        setLayout(null);
        buttonUtils = new ButtonUtils();
        JButton back = buttonUtils.goBack(appFrame, "appRandomResult");
        JLabel jLabel = new JLabel();
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

