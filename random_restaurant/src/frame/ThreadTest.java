package frame;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(1000);
                int size = 50;
                System.out.println(Thread.currentThread().getName());
                for (int i = 0; i < size; i++) {
                    System.out.println(i);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 공유자원 정리
            // 해당 스레드에서 사용한 메모리 자원 정리(close 같은 작업들)
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(10000);
        threadTest.interrupt();
    }
}
