package frame.components;

import frame.AppFrame;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;

import static constant.Constants.*;

public class AppStartPanel extends JPanel {

    private ButtonUtils buttonUtils;

    /**
     * 생성자
     *
     * @param appFrame
     */
    public AppStartPanel(AppFrame appFrame) {
        setLayout(null);
        buttonUtils = new ButtonUtils();
        add(buttonUtils.start(appFrame));
        add(buttonUtils.close(appFrame));
        add(buttonUtils.openGit(GIT));
    }

    /**
     * 패널 배경 이미지 넣기
     * background 를 그려준다
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon(APP_START_IMG).getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

