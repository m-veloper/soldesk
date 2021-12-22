package common;

import javax.swing.*;
import java.awt.*;

public class ComponentUtils {

    public static JFrame setFrameSettings(JFrame jFrame){
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

    public static JButton setTransparencyButton(JButton jButton, String imgPath, int x, int y, int width, int height){
        if (imgPath != null){
            Image image = new ImageIcon(imgPath).getImage();
            ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
            jButton.setIcon(imageIcon);
        }
        jButton.setBackground(Color.WHITE);
        jButton.setBounds(x, y, width, height);
        jButton.setBorderPainted(false);
        jButton.setFocusPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setOpaque(true);
        return jButton;
    }
}
