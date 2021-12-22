package frame.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMainPanel extends JPanel {

    private AppFrame frame;
    private JButton start = new JButton();
    private JPanel panel = new JPanel();
    private JPanel btnpanel = new JPanel();
    JButton btn1 = new JButton("DearFriend");
    JButton btn2 = new JButton("EXID");
    JTextArea txtArea = new JTextArea();
    /**
     * 생성자
     * @param
     * @param appFrameBase
     */
    public AppMainPanel(AppFrame appFrameBase) {
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


        panel.add(btnpanel, BorderLayout.BEFORE_FIRST_LINE);
        panel.add(txtArea, BorderLayout.CENTER);

        add(start);
        add(panel);

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

