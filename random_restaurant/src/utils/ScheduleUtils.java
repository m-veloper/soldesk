package utils;

import frame.components.AppRandomPanel;

import java.util.Timer;
import java.util.TimerTask;

public class ScheduleUtils {

    /**
     * Ÿ�̸Ӹ� �̿��ؼ�
     * Ư�� �ð��� ������
     * ���� �����带 ���� ��Ų��.
     * @param thread
     */
    public static void interruptThread(Thread thread){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                thread.interrupt();
            }
        };
        timer.schedule(timerTask, 10000);
    }
}
