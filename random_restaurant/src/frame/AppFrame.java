package frame;

import frame.components.*;
import service.RestaurantDB;
import utils.FrameUtils;

import javax.swing.*;
import java.awt.*;


public class AppFrame extends JFrame {

    // CardLayOut 객체  통해 하나의 프레임에 각 패널들을 삽입
    private final CardLayout cards = new CardLayout();
    private FrameUtils frameUtils = new FrameUtils();
    private RestaurantDB restaurantDB = new RestaurantDB();
    private static AppFrame instance;

    /**
     * 생성자
     *
     * @param
     */
    public AppFrame() {
        getContentPane().setLayout(cards);
//        getContentPane().removeAll();

        getContentPane().add("appBase", new AppBasePanel(this));
        getContentPane().add("appStart", new AppStartPanel(this));
        getContentPane().add("appMain", new AppMainPanel(this));
        getContentPane().add("appRandom", new AppRandomPanel(this, restaurantDB));
        getContentPane().add("appCategory", new AppCategoryPanel(this, restaurantDB));

        // 기본 셋팅 설정
        frameUtils.setFrameSettings(this);
    }

    /**
     * CardLayout 으로 패널을 보여주고 가린다.
     *
     * @return
     */
    public CardLayout getCardLayout() { // 각각의 버튼에 따른 패널을 불러올 수있게 하는 메소드
        return cards;
    }

    //싱글톤 기법을 사용하려고 한다
    public static void getInstance() {
        //static으로 선언했으므로 해당 메서드가 생성자보다도 먼저 호출된다
        instance = new AppFrame();//생성자를 통해 기본 프레임 정의
//        instance.removeAll();
        instance.revalidate(); //레이아웃 관리자에게 레이아웃정보를 다시 계산하도록 지시
        instance.repaint(); //레이아웃을 새로 그린다
    }
}

