package frame.components;

import frame.AppFrame;
import model.ButtonActionStatusDto;
import service.RestaurantDB;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AppCategoryPanel extends JPanel {

    private  ButtonUtils buttonUtils;
    private  ArrayList<JButton> countryBtnList;

    /**
     * 생성자
     * @param appFrame
     * @param restaurantDB
     */
    public AppCategoryPanel(AppFrame appFrame, RestaurantDB restaurantDB, ButtonActionStatusDto buttonActionStatusDto) {
        setLayout(null);
        buttonUtils = new ButtonUtils();
        countryBtnList = buttonUtils.getCountryBtn(appFrame, buttonActionStatusDto);


        JButton back = buttonUtils.goBack(appFrame, "appCategory");
        JButton korean = buttonUtils.korean();
        JButton japanese = buttonUtils.japanese();
        JButton chinese = buttonUtils.chinese();
        JButton western = buttonUtils.western();
        JButton asian = buttonUtils.asian();

        add(back);
        countryBtnList.stream().forEach(s -> add(s));
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

