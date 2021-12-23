package utils;

import javax.swing.*;
import java.awt.*;

public class FrameUtils implements Frame {

    @Override
    public JFrame setBackgroundImg(JFrame jFrame) {
        jFrame.setContentPane(new JLabel((new ImageIcon("./random_restaurant/resources/img/base_img.png"))));
        return jFrame;
    }

    @Override
    public JFrame setFrameSettings(JFrame jFrame) {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(410, 840);
        jFrame.setResizable(false);
        // ������ ������ ���
        Dimension frameSize = jFrame.getSize();
        // ����� ������ ���
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // ȭ�� �߾ӿ� ��ġ ��Ű��
        jFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        return jFrame;
    }
}
