package frame;


import constant.PanelCode;
import frame.components.AppBasePanel;
import frame.components.AppMainPanel;
import frame.components.AppStartPanel;
import utils.FrameUtils;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    // CardLayOut 객체  통해 하나의 프레임에 각 패널들을 삽입
    private final CardLayout cards;
    private FrameUtils frameUtils;
    private static AppFrame instance;

    /**
     * 생성자
     *
     * @param
     */
    public AppFrame() {
        cards = new CardLayout();
        frameUtils = new FrameUtils();

        getContentPane().setLayout(cards);
        getContentPane().add(PanelCode.APP_BASE.getValue(), new AppBasePanel(this));
        getContentPane().add(PanelCode.APP_START.getValue(), new AppStartPanel(this));
        getContentPane().add(PanelCode.APP_MAIN.getValue(), new AppMainPanel(this));

        // 기본 셋팅 설정
        frameUtils.setFrameSettings(this);
    }

    /**
     * CardLayout 으로 패널을 보여 주고 가린다.
     *
     * @return
     */
    public CardLayout getCardLayout() { // 각각의 버튼에 따른 패널을 불러올 수있게 하는 메소드
        return cards;
    }


    /**
     * 싱글톤을 사용합니다.
     * static으로 선언했으므로 해당 메서드가 생성자보다도 먼저 호출
     */
    public static void getInstance() {

        // 생성자를 통해 기본 프레임 정의
        instance = new AppFrame();
        // 레이아웃 관리자에게 레이아웃정보를 다시 계산하도록 지시
        instance.revalidate();
        // 레이아웃을 새로 그린다
        instance.repaint();
    }
}

