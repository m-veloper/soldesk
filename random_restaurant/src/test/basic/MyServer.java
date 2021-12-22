package test.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{

    ServerSocket serverSocket;

    public MyServer() {
        try {
            serverSocket = new ServerSocket(3001);
            System.out.println("서버 시작");
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        new MyServer().start();
    }

    @Override
    public void run() {
        // 메시지 전송

        while (true){
            try {
                Socket socket = serverSocket.accept();

                BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(socket.getInputStream())));

                String msg = bufferedReader.readLine(); // 접속자 메세지
                String ip = socket.getInetAddress().getHostAddress();

                System.out.println(msg + ip);

            }catch (Exception e){

            }
        }
    }
}
