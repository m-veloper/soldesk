package frame.base;

import frame.components.AppStartPanel;
import frame.components.HomePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 최초 설정 프레임
 */
public class Base extends JFrame {

    private static Base instance;
	// CardLayOut 객체  통해 하나의 프레임에 각 패널들을 삽입
	private final CardLayout cards = new CardLayout();
    /**
     * 생성자
	 *  - 기본 JFrame 구조 셋팅
     */
    private Base() {

		getContentPane().setLayout(cards);
		//최초실행시 보여질 화면, 그리고 따로 만들어진 각각의 패널들을 삽입

		getContentPane().add(new HomePanel(this));
		getContentPane().add(new AppStartPanel(this));

		setBackground(Color.WHITE);
		setSize(450, 940);
		setVisible(true);
		setResizable(false);


		// 프레임 사이즈 얻기
		Dimension frameSize = getSize();
		// 모니터 사이즈 얻기
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// 화면 중앙에 위치 시키기
		setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		// 메인 프레임 닫기(x) 버튼 누르면 종료됨
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.addWindowListener(new JFrameWindowClosingEventHandler());

    }
	class JFrameWindowClosingEventHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			JFrame frame = (JFrame)e.getWindow();
			// yer = 0, no = 1
			int result = JOptionPane.showConfirmDialog(null, "정말 앱을 종료 하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
			if (result == 0 ){
//				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
	}
	/**
	 * 클릭시 패널을 겹치게 한다
	 */
	public void changePanel() {
		cards.next(getContentPane());
	}

    /**
     * 싱글톤 생성
     */
    public static void getInstance() {

        //static으로 선언했으므로 해당 메서드가 생성자보다도 먼저 호출된다
        //생성자를 통해 기본 프레임 정의
        instance = new Base();
    }
}
