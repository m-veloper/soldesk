package utils;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleImpl implements Schedule {

    /**
     * Ÿ�̸Ӹ� �̿��ؼ� ������â�ݱ�
     *
     * @param jFrame
     */
    @Override
    public void closeFrame(JFrame jFrame) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                jFrame.dispose();
            }
        };
        timer.schedule(timerTask, 5000);
    }

    /**
     * Ÿ�̸Ӹ� �̿��ؼ� �г� �Ⱥ��̰� �ϱ�
     *
     * @param jPanel
     */
    @Override
    public void closePanel(JPanel jPanel) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                jPanel.setVisible(false);
            }
        };
        timer.schedule(timerTask, 5000);
    }

    /**
     * ������ �ּ�ȭ �ϱ�
     *
     * @param jFrame
     */
    @Override
    public void minimizeFrame(JFrame jFrame) {
        jFrame.setState(Frame.ICONIFIED);
    }

    /**
     * ������ �ִ�ȭ �ϱ�
     * @param jFrame
     */
    @Override
    public void maximizeFrame(JFrame jFrame) {
        jFrame.setState(Frame.MAXIMIZED_BOTH);
    }

}
