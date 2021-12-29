package frame.components;

import frame.AppFrame;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;

import static constant.Constants.APP_PANEL_IMG;
import static constant.PanelCode.APP_CATEGORY;

public class AppCategoryPanel extends JPanel {

    private ButtonUtils buttonUtils;

    /**
     * 생성자
     *
     * @param appFrame
     */
    public AppCategoryPanel(AppFrame appFrame) {
        setLayout(null);
        buttonUtils = new ButtonUtils();

        // 돌아가기 버튼
        add(buttonUtils.goBack(appFrame, APP_CATEGORY, null));

        // 카테고리 버튼
        buttonUtils.getCategoryBtnBtn(appFrame).stream().forEach(s -> add(s));
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

