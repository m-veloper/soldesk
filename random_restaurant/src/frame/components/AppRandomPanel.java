package frame.components;

import model.RestaurantDto;
import service.Restaurant;
import service.RestaurantDB;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppRandomPanel extends JPanel {

    private RestaurantDto restaurantDto;
    private Restaurant restaurant;
    private ButtonUtils buttonUtils;

    /**
     * 생성자
     * @param
     * @param appFrameBase
     */
    public AppRandomPanel(AppFrame appFrameBase, RestaurantDB restaurantDB) {
        setLayout(null);

        restaurant = new Restaurant();
        buttonUtils = new ButtonUtils();

        JButton back = buttonUtils.back();
        JButton start = buttonUtils.start();

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(80,150, 200,200);
        resultArea.setBackground(Color.cyan);

        add(back);
        add(start);
        add(resultArea);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.setText("");
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appMain");
            }
        });
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restaurantDto = restaurant.getRandomRestaurant(restaurantDB);
                resultArea.setText(restaurantDto.getPlaceName());
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

