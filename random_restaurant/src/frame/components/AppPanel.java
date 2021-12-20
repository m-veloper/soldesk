package frame.components;

import frame.base.Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppPanel extends JPanel {

    private Base reBase;
    /**
     * 생성자
     */
    public AppPanel(Base base) {


        JButton menuBarButton = new JButton("back");
        menuBarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                base.changePanel();
            }
        });

        menuBarButton.setFont(new Font("Arial", Font.PLAIN, 20));
        menuBarButton.setForeground(Color.BLACK);
        menuBarButton.setBackground(Color.WHITE);
        menuBarButton.setBounds(50, 10, 100, 30);
        menuBarButton.setBorderPainted(false);
        menuBarButton.setContentAreaFilled(true);
        menuBarButton.setFocusPainted(false);
        menuBarButton.setOpaque(true);


        JButton btnRandom = new JButton("random");
        btnRandom.setFont(new Font("Arial", Font.PLAIN, 40));
        btnRandom.setForeground(Color.BLACK);
        btnRandom.setBackground(Color.red);
        btnRandom.setBounds(60, 600, 150, 30);
        btnRandom.setBorderPainted(false);
        btnRandom.setContentAreaFilled(true);
        btnRandom.setFocusPainted(false);
        btnRandom.setOpaque(true);

        JButton btnCategory = new JButton("k,j,c");
        btnCategory.setFont(new Font("Arial", Font.PLAIN, 20));
        btnCategory.setForeground(Color.BLACK);
        btnCategory.setBackground(Color.red);
        btnCategory.setBounds(80, 700, 150, 30);
        btnCategory.setBorderPainted(false);
        btnCategory.setContentAreaFilled(true);
        btnCategory.setFocusPainted(false);
        btnCategory.setOpaque(true);


        add(btnRandom);
        add(btnCategory);
        add(menuBarButton);
        setBackground(Color.WHITE);
        setVisible(true);
        setLayout(null);
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

