package frame.base;

import frame.components.AppFrame;
import frame.components.AppStartPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static common.ComponentUtils.setFrameSettings;
import static common.ComponentUtils.setTransparencyButton;

/**
 * ���� ���� ������
 */
public class Base extends JFrame {

    private static Base instance;
    /**
     * ������
	 *  - �⺻ JFrame ���� ����
	 * @param
	 */
    private Base() {
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new JLabel(new ImageIcon("./random_restaurant/resources/img/base_img.png")));

		// ���� ��ư ����
		JButton appIconBtn = setTransparencyButton(new JButton(),
					"./random_restaurant/resources/img/icon/app_icon.png",
							46, 465, 62, 62);
		add(appIconBtn);

		// �⺻ ���� ����
		setFrameSettings(this);

		appIconBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �ּ�ȭ
				setState(Frame.ICONIFIED);
				new AppFrame();
			}
		});
    }

    /**
     * �̱��� ����
     */
    public static void getInstance() {
        //static���� ���������Ƿ� �ش� �޼��尡 �����ں��ٵ� ���� ȣ��ȴ�
        //�����ڸ� ���� �⺻ ������ ����
        instance = new Base();
		instance.revalidate(); //���̾ƿ� �����ڿ��� ���̾ƿ������� �ٽ� ����ϵ��� ����
		instance.repaint(); //���̾ƿ��� ���� �׸���
    }
}
