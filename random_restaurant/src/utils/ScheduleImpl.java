package utils;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleImpl implements Schedule {

    /**
     * 타이머를 이용해서 프레임창닫기
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
     * 타이머를 이용해서 패널 안보이게 하기
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
     * 프레임 최소화 하기
     *
     * @param jFrame
     */
    @Override
    public void minimizeFrame(JFrame jFrame) {
        jFrame.setState(Frame.ICONIFIED);
    }

    /**
     * 프레임 최대화 하기
     * @param jFrame
     */
    @Override
    public void maximizeFrame(JFrame jFrame) {
        jFrame.setState(Frame.MAXIMIZED_BOTH);
    }

}
