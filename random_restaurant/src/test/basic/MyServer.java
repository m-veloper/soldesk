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
            System.out.println("���� ����");
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        new MyServer().start();
    }

    @Override
    public void run() {
        // �޽��� ����

        while (true){
            try {
                Socket socket = serverSocket.accept();

                BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(socket.getInputStream())));

                String msg = bufferedReader.readLine(); // ������ �޼���
                String ip = socket.getInetAddress().getHostAddress();

                System.out.println(msg + ip);

            }catch (Exception e){

            }
        }
    }
}
