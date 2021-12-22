package frame.components;

import frame.AppFrame;
import model.RestaurantDto;
import service.Restaurant;
import service.RestaurantDB;
import utils.ButtonUtils;
import utils.ScheduleUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class AppRandomPanel extends JPanel {

    private RestaurantDto restaurantDto;
    private Restaurant restaurant;
    private ButtonUtils buttonUtils;
    JLabel foodImage;

    /**
     * 생성자
     *
     * @param appFrameBase
     * @param restaurantDB
     */
    public AppRandomPanel(AppFrame appFrameBase, RestaurantDB restaurantDB) {
        setLayout(null);

        restaurant = new Restaurant();
        buttonUtils = new ButtonUtils();

        JButton back = buttonUtils.back();
        JButton start = buttonUtils.start();

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(80, 150, 200, 200);
        resultArea.setBackground(Color.cyan);

        foodImage = new JLabel("");
        foodImage.setIcon(new ImageIcon("./random_restaurant/resources/img/korean.png"));
        foodImage.setBounds(25, 30, 335, 425);
        add(foodImage);

        add(back);
        add(start);
        add(resultArea);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.setText("");
                appFrameBase.getCardLayout().show(appFrameBase.getContentPane(), "appMain");
            }
        });

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                restaurantDto = restaurant.getRandomRestaurant(restaurantDB);
//                resultArea.setText(restaurantDto.getPlaceName());

                //쓰레드
                ImgThread imgThread = new ImgThread();
                imgThread.start();
                ScheduleUtils.interruptThread(imgThread);
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

    class ImgThread extends Thread {

        String[] imgs = {
                "./random_restaurant/resources/img/korean.png",
                "./random_restaurant/resources/img/japanese.png",
                "./random_restaurant/resources/img/chinese.png",
                "./random_restaurant/resources/img/western.png",
                "./random_restaurant/resources/img/asian.png"
        };

        @Override
        public void run() {

            try {
                while (!Thread.currentThread().isInterrupted()) {
                    for (int i = 0; i < imgs.length; i++) {
//                        System.out.println(i);
                        Thread.sleep(500);
                        ImageIcon icon = new ImageIcon(imgs[i]);
                        foodImage.setIcon(icon);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 공유자원 정리
                // 해당 스레드에서 사용한 메모리 자원 정리(close 같은 작업들)
            }
        }
    }
}



