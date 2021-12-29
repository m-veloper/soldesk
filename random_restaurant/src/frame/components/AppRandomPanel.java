package frame.components;

import constant.CategoryBtnCode;
import frame.AppFrame;
import utils.ButtonUtils;
import utils.PanelUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static constant.Constants.APP_PANEL_IMG;
import static constant.Constants.KOREAN_FOOD_IMG;
import static constant.PanelCode.APP_RANDOM;

public class AppRandomPanel extends JPanel {

    private ButtonUtils buttonUtils;
    private PanelUtils panelUtils;
    private JLabel foodImage;

    /**
     * 생성자
     *
     * @param appFrame
     */
    public AppRandomPanel(AppFrame appFrame, String status) {
        System.out.println(status);
        setLayout(null);
        buttonUtils = new ButtonUtils();
        panelUtils = new PanelUtils();

        // 랜덤 시작 버튼
        JButton startRandom = buttonUtils.startRandom(appFrame);

        // 로딩 텍스트 라벨
        JLabel loading = panelUtils.makeLoadingLabel();
        loading.setFont(new Font("", Font.BOLD, 35));
        loading.setVisible(false);

        // 스레드를 위해 초기 이미지를 세팅합니다.
        foodImage = new JLabel();
        foodImage.setIcon(new ImageIcon(KOREAN_FOOD_IMG));
        foodImage.setBounds(100, 200, 200, 200);

        // 뒤로가기 버튼
        add(buttonUtils.goBack(appFrame, APP_RANDOM, status));
        add(foodImage);
        add(startRandom);
        add(loading);

        startRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 쓰레드 시작
                ImgThread imgThread = new ImgThread();
                imgThread.start();

                // 시작 버튼 비활성화
                startRandom.setEnabled(false);
                // 시작 버튼 안보이게
                startRandom.setVisible(false);
                // 로딩 버튼 보이고
                loading.setVisible(true);
                // 쓰레드 인터럽트를 위해 메소드 호출
                buttonUtils.interruptRandomImgTread(imgThread, startRandom, loading, appFrame, status);
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
        Image image = new ImageIcon(APP_PANEL_IMG).getImage();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }


    /**
     * Thread 로 음식 이미지를 보여줍니다.
     */
    class ImgThread extends Thread {

        public ArrayList<String> getImgList() {
            ArrayList<String> imgList = new ArrayList<>();
            CategoryBtnCode.getCategoryInfo().stream().forEach(s -> imgList.add(s.get("foodImgPath")));
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



