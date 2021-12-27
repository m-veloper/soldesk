package frame.components;

import frame.AppFrame;
import service.RestaurantDB;
import utils.ButtonUtils;
import utils.PanelUtils;
import utils.WindowHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AppRandomResultPanel extends JPanel {

    private ButtonUtils buttonUtils;
    private PanelUtils panelUtils;


    /**
     * 생성자
     *
     * @param appFrame
     * @param restaurantDB
     */
    public AppRandomResultPanel(AppFrame appFrame, RestaurantDB restaurantDB) {
        setLayout(null);
        buttonUtils = new ButtonUtils();
        panelUtils = new PanelUtils();

        // 마지막 인덱스의 데이터 추출
        JLabel url = panelUtils.makeRandomResultByJLabel(restaurantDB).get(panelUtils.makeRandomResultByJLabel(restaurantDB).size() - 1);
        panelUtils.makeRandomResultByJLabel(restaurantDB).stream().forEach(s -> {
            add(s);
        });

        JButton back = buttonUtils.goBack(appFrame, "appRandomResult");
        add(back);

        JButton openWindow = buttonUtils.openBrowser(url.getText());
        openWindow.setBounds(80, 650, 230, 50);
        add(openWindow);
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

