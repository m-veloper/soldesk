package frame.components;

import constant.Country;
import frame.AppFrame;
import service.Restaurant;
import utils.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AppRandomPanel extends JPanel {

    private ButtonUtils buttonUtils;
    JLabel foodImage;

    /**
     * 생성자
     *
     * @param appFrame
     */
    public AppRandomPanel(AppFrame appFrame) {
        setLayout(null);
        buttonUtils = new ButtonUtils();

        JButton back = buttonUtils.goBack(appFrame, "appRandom");
        JButton startRandom = buttonUtils.startRandom(appFrame);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(80, 150, 200, 200);
        resultArea.setBackground(Color.cyan);

        foodImage = new JLabel("");
        foodImage.setIcon(new ImageIcon("./random_restaurant/resources/img/food/korean_food.png"));
        foodImage.setBounds(100, 200, 200, 200);

        add(foodImage);
        add(back);
        add(startRandom);

        startRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 쓰레드 시작
                ImgThread imgThread = new ImgThread();
                imgThread.start();
                startRandom.setEnabled(false);
                startRandom.setVisible(false);
                buttonUtils.interruptRandomImgTread(imgThread, startRandom, appFrame);
            }
        });
    }

    /**
     * 패널 배경 이미지 넣기
     * background 를 그려준다
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("./random_restaurant/resources/img/app_panel.png").getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }


    /**
     * Thread 로 음식 이미지를 보여줍니다.
     */
    class ImgThread extends Thread {

        public ArrayList<String> getImgList() {
            ArrayList<String> imgList = new ArrayList<>();
            Country.getCountry().stream().forEach(s -> imgList.add(s.get("foodImgPath")));
            return imgList;
        }

        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    for (int i = 0; i < this.getImgList().size(); i++) {
                        Thread.sleep(100);
                        ImageIcon icon = new ImageIcon(this.getImgList().get(i));
                        foodImage.setIcon(icon);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



