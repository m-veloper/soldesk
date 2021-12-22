package test.basic;

public class ThreadExam extends Thread {

    private int[] temp;

    public ThreadExam() {
        temp = new int[10];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
    }

    @Override
    public void run() {
        for (int i : temp) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[i] : " + i);
        }
    }
}
