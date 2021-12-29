package frame.components;

import frame.AppFrame;
import utils.ButtonUtils;
import utils.PanelUtils;

import javax.swing.*;
import java.awt.*;

import static constant.Constants.APP_PANEL_IMG;
import static constant.PanelCode.APP_RANDOM_RESULT;

public class AppRandomResultPanel extends JPanel {

    private ButtonUtils buttonUtils;
    private PanelUtils panelUtils;

    /**
     * 생성자
     *
     * @param appFrame
     * @param status
     */
    public AppRandomResultPanel(AppFrame appFrame, String status) {
        setLayout(null);
        buttonUtils = new ButtonUtils();
        panelUtils = new PanelUtils();

        // 객체의 사이즈 설정
        int size = panelUtils.getRestaurantResult(status).size();

        // 객체의 마지막 인덱스에 위치한 url 데이터를 추출
        JLabel url = panelUtils.getRestaurantResult(status).get(size - 1);
        panelUtils.getRestaurantResult(status).stream().forEach(s -> {
            add(s);
        });

        // 뒤로가기 버튼
        add(buttonUtils.goBack(appFrame, APP_RANDOM_RESULT, status));

        // 웹 브라우져 오픈
        add(buttonUtils.openKakaoMap(url.getText()));
    }

    /**
     * 패널 배경 이미지 넣기
     * background 를 그려준다
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon(APP_PANEL_IMG).getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

