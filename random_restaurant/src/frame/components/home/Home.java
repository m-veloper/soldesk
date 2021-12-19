package frame.components.home;

import frame.base.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JPanel {

    /**
     * 생성자
     */
    public Home(Base base) {

        // 이미지 넣기
//        Image image = new ImageIcon("./resources/img/base_img.png").getImage();
//        ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(450, 900, Image.SCALE_SMOOTH));
//        JLabel homeImageLabel = new JLabel(imageIcon);
//        add(homeImageLabel);

        JButton menuBarButton = new JButton();
//        menuBarButton.setIcon(new ImageIcon("./img/home/menubarbutton.png"));
        menuBarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                base.changePanel();
            }
        });

        menuBarButton.setToolTipText("category");
        menuBarButton.setForeground(Color.WHITE);
        menuBarButton.setBackground(Color.WHITE);
        menuBarButton.setBounds(200, 10, 200, 38);

        // 버튼 이미지 태두리와 배경 삭제
        menuBarButton.setBorderPainted(false);
        menuBarButton.setContentAreaFilled(true);
        menuBarButton.setFocusPainted(false);
        menuBarButton.setOpaque(true);
        add(menuBarButton);

        setLayout(null);
    }

    /**
     * 프레임에 배경 이미지 넣기
     * background 를 그려준다
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        Image image = new ImageIcon("./resources/img/base_img.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

