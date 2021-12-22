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
            System.out.println("���� ����!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new MyServer().start();

    }

    @Override
    public void run() {
        // �޼��� ����

        while (true) {


            try {
                Socket s = ss.accept(); //������ �߻�

                //Ŭ���̾�Ʈ�� �������ڸ��� ���ڿ��� ���� -> ���⼭�� ���ڿ��� �޴� ����½�Ʈ���� ���
                BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

                String msg = reader.readLine();//������ �޼���

                String ip = s.getInetAddress().getHostAddress();

                System.out.println(ip + " : " + msg);


            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }


        }
    }


}





