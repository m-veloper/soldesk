package frame.base;

import utils.ButtonUtils;
import utils.FrameUtils;
import frame.components.AppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 최초 설정 프레임
 */
public class Base extends JFrame {

    private static Base instance;
    private FrameUtils frameUtils = new FrameUtils();
    private ButtonUtils buttonUtils = new ButtonUtils();

    /**
     * 생성자
	 *  - 기본 JFrame 구조 셋팅
	 * @param
	 */
    private Base() {
		frameUtils.setBackgroundImg(this);
		JButton appIconBtn = buttonUtils.appIcon();
		add(appIconBtn);
		frameUtils.setFrameSettings(this);
		appIconBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 최소화
				setState(Frame.ICONIFIED);
				new AppFrame();
			}
		});
    }

    /**
     * 싱글톤 생성
     */
    public static void getInstance() {
        //static으로 선언했으므로 해당 메서드가 생성자보다도 먼저 호출된다
        //생성자를 통해 기본 프레임 정의
        instance = new Base();
		instance.revalidate(); //레이아웃 관리자에게 레이아웃정보를 다시 계산하도록 지시
		instance.repaint(); //레이아웃을 새로 그린다
    }
}
