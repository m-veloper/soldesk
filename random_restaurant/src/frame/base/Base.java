package frame.base;

import frame.components.home.Home;

import javax.swing.*;
import java.awt.*;

/**
 * ���� ���� ������
 */
public class Base extends JFrame {

    private static Base instance;
	// CardLayOut ��ü  ���� �ϳ��� �����ӿ� �� �гε��� ����
	private final CardLayout cards = new CardLayout();
	private final Image image = new ImageIcon("./resources/img/base_img.png").getImage();
    /**
     * ������
	 *  - �⺻ JFrame ���� ����
     */
    private Base() {

		getContentPane().setLayout(cards);
		//���ʽ���� ������ ȭ��, �׸��� ���� ������� ������ �гε��� ����
		getContentPane().add(new Home(this));

		setBackground(Color.WHITE);
		setSize(450, 940);
		setVisible(true);
//		setIconImage();

		// ������ ������ ���
		Dimension frameSize = getSize();
		// ����� ������ ���
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// ȭ�� �߾ӿ� ��ġ ��Ű��
		setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);

		// ���� ������ �ݱ�(x) ��ư ������ �����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
