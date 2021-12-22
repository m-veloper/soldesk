package frame.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static common.ComponentUtils.setTransparencyButton;

public class AppStartPanel extends JPanel {

    /**
     * 생성자
     *
     * @param
     * @param appFrameBase
     */
    public AppStartPanel(AppFrame appFrameBase) {
        setLayout(null);
        JButton start = setTransparencyButton(new JButton(),
                        "./random_restaurant/resources/img/icon/start_icon.png",
                        80, 600,230, 40);
        add(start);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appMain");
            }
        });
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

