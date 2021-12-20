package frame.components;

import frame.base.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame {

    private Base reBase;
    /**
     * 생성자
     */
    public AppFrame(Base base) {
        setVisible(true);
    }

    /**
     * 프레임에 배경 이미지 넣기
     * background 를 그려준다
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        Image image = new ImageIcon("./random_restaurant/resources/img/app_panel.png").getImage();
        g.setColor(Color.white);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

