package frame.components;

import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMainPanelTester extends JPanel {

    private AppFrame frame;
    private JButton start = new JButton();
    private JPanel panel = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel btnpanel = new JPanel();
    JButton btn1 = new JButton("DearFriend");
    JButton btn2 = new JButton("EXID");
    JTextArea txtArea = new JTextArea();
    private ButtonUtils buttonUtils = new ButtonUtils();

    /**
     * 생성자
     * @param
     * @param appFrameBase
     */
    public AppMainPanelTester(AppFrame appFrameBase) {
        setLayout(null);
        JButton start = buttonUtils.start();
        JButton backButton = new JButton("뒤로가기");

        backButton.setBackground(Color.WHITE);
        backButton.setSize(100, 50);
        backButton.setForeground(Color.BLACK);

        start.setBackground(Color.RED);
        start.setSize(100, 50);
        start.setBorderPainted(true);
        start.setFocusPainted(true);
        start.setContentAreaFilled(true);
        start.setOpaque(true);


        btn1.setBackground(Color.BLACK);
        btn1.setSize(100, 50);
        btn1.setBorderPainted(true);
        btn1.setFocusPainted(true);
        btn1.setContentAreaFilled(true);
        btn1.setOpaque(true);

        btn2.setBackground(Color.BLACK);
        btn2.setSize(100, 50);
        btn2.setBorderPainted(true);
        btn2.setFocusPainted(true);
        btn2.setContentAreaFilled(true);
        btn2.setOpaque(true);

        txtArea.setBackground(Color.YELLOW);
        txtArea.setSize(100, 200);

        panel.setLayout(new BorderLayout());

        btnpanel.add(btn1);
        btnpanel.add(btn2);
        btnpanel.add(backButton);


        panel.add(btnpanel);
        panel.add(txtArea);
        panel2.add(txtArea);
        panel2.add(btnpanel);
//        panel.add(txtArea, BorderLayout.CENTER);

        add(start, BorderLayout.NORTH);
        add(panel, BorderLayout.SOUTH);
        add(panel2, BorderLayout.SOUTH);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.append("PangPangMan\n");
            }
        });
    }

    /**
     * 패널 배경 이미지 넣기
     * background 를 그려준다
     * @param g
     */
    @Override
    public void paintComponent(Graphics g){
        Image image = new ImageIcon("./random_restaurant/resources/img/app_panel.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

