package utils;

import javax.swing.*;
import java.awt.*;

public class FrameUtils implements Frame {

    @Override
    public JFrame setFrameSettings(JFrame jFrame) {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(410, 840);
        jFrame.setResizable(false);
        // 프레임 사이즈 얻기
        Dimension frameSize = jFrame.getSize();
        // 모니터 사이즈 얻기
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // 화면 중앙에 위치 시키기
        jFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        return jFrame;
    }
}
