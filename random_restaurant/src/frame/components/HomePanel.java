package frame.components;

import frame.base.Base;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class HomePanel extends JPanel {

    JButton appIconBtn = new JButton();

    // 아이콘 이미지 사이즈 설정
    Image image = new ImageIcon("./random_restaurant/resources/img/icon/app_icon.png").getImage();
    ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(65, 65, Image.SCALE_SMOOTH));

    /**
     * 생성자
     */
    public HomePanel(Base base) {
        appIconBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.changePanel();
                java.util.Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        base.setState(Frame.ICONIFIED);
                        new AppFrame(base);
                    }
                };
                timer.schedule(timerTask, 5000);
            }
        });
    }

    /**
     * 프레임에 배경 이미지 넣기
     * background 를 그려준다
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        // 1. 배경 그리기
        Image image = new ImageIcon("./random_restaurant/resources/img/base_img.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

        // 2. 배경을 그린 후 버튼 삽입
        appIconBtn.setIcon(imageIcon);
        appIconBtn.setBorderPainted(false);
        appIconBtn.setFocusPainted(false);
        appIconBtn.setContentAreaFilled(false);
        appIconBtn.setOpaque(true);
        appIconBtn.setBounds(52, 520, 65, 65);
        add(appIconBtn);
    }
}

