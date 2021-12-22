package frame.base;

import utils.ButtonUtils;
import utils.FrameUtils;
import frame.components.AppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ���� ���� ������
 */
public class Base extends JFrame {

    private static Base instance;
    private FrameUtils frameUtils = new FrameUtils();
    private ButtonUtils buttonUtils = new ButtonUtils();

    /**
     * ������
	 *  - �⺻ JFrame ���� ����
	 * @param
	 */
    private Base() {
		frameUtils.setBackgroundImg(this);
		JButton appIconBtn = buttonUtils.appIcon();
		add(appIconBtn);
		frameUtils.setFrameSettings(this);
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
