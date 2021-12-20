package frame.components;

import frame.base.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel {

    private Base reBase;

    /**
     * 생성자
     */
    public HomePanel(Base base) {

        reBase = base;
        // 이미지 넣기
//        Image image = new ImageIcon("./resources/img/base_img.png").getImage();
//        ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(450, 900, Image.SCALE_SMOOTH));
//        JLabel homeImageLabel = new JLabel(imageIcon);
//        add(homeImageLabel);

        JButton menuBarButton = new JButton("R");
//        menuBarButton.setIcon(new ImageIcon("./img/home/menubarbutton.png"));
        menuBarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reBase.changePanel();
            }
        });

        menuBarButton.setFont(new Font("Arial", Font.PLAIN, 40));
        menuBarButton.setForeground(Color.BLACK);
        menuBarButton.setBackground(Color.WHITE);
        menuBarButton.setBounds(52, 520, 65, 65);

        // 버튼 이미지 태두리와 배경 삭제
        menuBarButton.setBorderPainted(false);
        menuBarButton.setContentAreaFilled(true);
        menuBarButton.setFocusPainted(false);
        menuBarButton.setOpaque(true);
        add(menuBarButton);
        setBackground(Color.WHITE);
        setLayout(null);
    }

    /**
     * 프레임에 배경 이미지 넣기
     * background 를 그려준다
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        Image image = new ImageIcon("./random_restaurant/resources/img/base_img.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

