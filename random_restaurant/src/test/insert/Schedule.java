package test.insert;

import java.util.Timer;
import java.util.TimerTask;

public class Schedule {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("asdadasd");
            }
        };
        timer.schedule(timerTask, 5000);
    }
}
