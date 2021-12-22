package test.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServer2 extends Thread {

    ServerSocket ss;

    public MyServer2() {

        try {

            ss = new ServerSocket(3001);
            System.out.println("서버 시작!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new MyServer().start();

    }

    @Override
    public void run() {
        // 메세지 전송

        while (true) {


            try {
                Socket s = ss.accept(); //접속자 발생

                //클라이언트가 접속하자마자 문자열을 보냄 -> 여기서는 문자열을 받는 입출력스트림을 사용
                BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

                String msg = reader.readLine();//접속자 메세지

                String ip = s.getInetAddress().getHostAddress();

                System.out.println(ip + " : " + msg);


            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }


        }
    }


}





