package common;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleImpl implements Schedule {


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

    @Override
    public void minimizeFrame(JFrame jFrame) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                jFrame.setState(Frame.ICONIFIED);
            }
        };
        timer.schedule(timerTask, 5000);
    }

}
