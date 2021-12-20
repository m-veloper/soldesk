package frame.base;

import frame.components.AppStartPanel;
import frame.components.HomePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���� ���� ������
 */
public class Base extends JFrame {

    private static Base instance;
	// CardLayOut ��ü  ���� �ϳ��� �����ӿ� �� �гε��� ����
	private final CardLayout cards = new CardLayout();
    /**
     * ������
	 *  - �⺻ JFrame ���� ����
     */
    private Base() {

		getContentPane().setLayout(cards);
		//���ʽ���� ������ ȭ��, �׸��� ���� ������� ������ �гε��� ����

		getContentPane().add(new HomePanel(this));
		getContentPane().add(new AppStartPanel(this));

		setBackground(Color.WHITE);
		setSize(450, 940);
		setVisible(true);
		setResizable(false);


		// ������ ������ ���
		Dimension frameSize = getSize();
		// ����� ������ ���
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// ȭ�� �߾ӿ� ��ġ ��Ű��
		setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		// ���� ������ �ݱ�(x) ��ư ������ �����
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.addWindowListener(new JFrameWindowClosingEventHandler());

    }
	class JFrameWindowClosingEventHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			JFrame frame = (JFrame)e.getWindow();
			// yer = 0, no = 1
			int result = JOptionPane.showConfirmDialog(null, "���� ���� ���� �Ͻðڽ��ϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);
			if (result == 0 ){
//				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
	}
	/**
	 * Ŭ���� �г��� ��ġ�� �Ѵ�
	 */
	public void changePanel() {
		cards.next(getContentPane());
	}

    /**
     * �̱��� ����
     */
    public static void getInstance() {

        //static���� ���������Ƿ� �ش� �޼��尡 �����ں��ٵ� ���� ȣ��ȴ�
        //�����ڸ� ���� �⺻ ������ ����
        instance = new Base();
    }
}
