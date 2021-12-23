package frame.components;

import constant.Country;
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
import java.util.*;
import java.util.List;
import java.util.Timer;

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
//        Image image = new ImageIcon("./random_restaurant/resources/img/food/korean_food.png").getImage();
//        ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(500, 500, Image.SCALE_SMOOTH));
        foodImage.setIcon(new ImageIcon("./random_restaurant/resources/img/food/korean_food.png"));
        foodImage.setBounds(100, 200, 200, 200);
        add(foodImage);

        add(back);
        add(startRandom);
//        add(resultArea);

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
            } finally {
                // 공유자원 정리
                // 해당 스레드에서 사용한 메모리 자원 정리(close 같은 작업들)
            }
        }
    }
}



