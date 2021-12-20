package frame.components;

import common.ScheduleImpl;
import frame.base.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppStartPanel extends JPanel {

    private Base reBase;
    private final ScheduleImpl schedule = new ScheduleImpl();

    /**
     * 생성자
     */
    public AppStartPanel(Base base) {
        setBackground(Color.WHITE);
        setVisible(true);
        schedule.closePanel(this);
    }

    /**
     * 프레임에 배경 이미지 넣기
     * background 를 그려준다
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        Image image = new ImageIcon("./random_restaurant/resources/img/app_start_panel.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

