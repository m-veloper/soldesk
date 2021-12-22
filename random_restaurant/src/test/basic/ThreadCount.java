package test.basic;

import java.util.Scanner;

public class ThreadCount implements Runnable {

    private int n;

    public ThreadCount(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        System.out.println("입력");
        Scanner scanner = new Scanner(System.in);

        ThreadCount threadCount = new ThreadCount(scanner.nextInt());
        Thread thread = new Thread(threadCount);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = n; i >= 0; i--){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }catch (Exception e){
                e.getStackTrace();
            }
        }
        System.out.println("종료");
    }
}
