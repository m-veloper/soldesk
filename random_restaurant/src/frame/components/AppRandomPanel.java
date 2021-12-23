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
     * @param appFrame
     * @param restaurantDB
     */
    public AppRandomPanel(AppFrame appFrame, RestaurantDB restaurantDB) {
        setLayout(null);
        restaurant = new Restaurant();
        buttonUtils = new ButtonUtils();

        JButton back = buttonUtils.goBack(appFrame, "appRandom");
        JButton startRandom = buttonUtils.startRandom(appFrame);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(80, 150, 200, 200);
        resultArea.setBackground(Color.cyan);

        foodImage = new JLabel("");
        Image image = new ImageIcon("./random_restaurant/resources/img/food/korean_food.png").getImage();
        ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        foodImage.setIcon(imageIcon);
        foodImage.setBounds(150, 300, 200, 200);
        add(foodImage);

        add(back);
        add(startRandom);
        add(resultArea);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.setText("");
                appFrame.getCardLayout().show(appFrame.getContentPane(), "appMain");
            }
        });

        startRandom.addActionListener(new ActionListener() {
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
                "./random_restaurant/resources/img/food/chinese_food.png",
                "./random_restaurant/resources/img/food/korean_food.png",
                "./random_restaurant/resources/img/food/japanese_food.png",
                "./random_restaurant/resources/img/food/western_food.png",
                "./random_restaurant/resources/img/food/asian_food.png"
        };

        @Override
        public void run() {

            try {
                while (!Thread.currentThread().isInterrupted()) {
                    for (int i = 0; i < imgs.length; i++) {
//                        System.out.println(i);
                        Thread.sleep(100);
                        ImageIcon icon = new ImageIcon(imgs[i]);
                        foodImage.setIcon(icon);

                        ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
                        foodImage.setIcon(imageIcon);
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



