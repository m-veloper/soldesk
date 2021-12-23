package utils;

import frame.components.AppRandomPanel;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleUtils {

    /**
     * 타이머를 이용해서
     * 특정 시간이 지나면
     * 실행 스레드를 종료 시킨다.
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
