package utils;

import frame.components.AppRandomPanel;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleUtils {

    /**
     * Ÿ�̸Ӹ� �̿��ؼ�
     * Ư�� �ð��� ������
     * ���� �����带 ���� ��Ų��.
     * @param thread
     */
    public static void interruptRandomImgTread(Thread thread){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                thread.interrupt();
            }
        };
        timer.schedule(timerTask, 5000);
    }
}
