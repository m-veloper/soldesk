package test.basic;

import java.awt.*;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) {
        System.out.println("�޽��� �Է� : ");
        Scanner scanner = new Scanner(System.in);

        String msg = scanner.nextLine();

        Socket socket = null;
        if (msg != null && msg.trim().length() > 0){
            try {
                // ������ ������ ��Ʈ
                socket = new Socket("172.16.10.109", 3001);

                // ���ڿ��� ������ ������
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

                // ������ ����
                printWriter.write(msg);

                // ��Ʈ�� ����
                printWriter.flush();

                if (printWriter != null){
                    printWriter.close();
                }
            }catch (Exception e) {
                e.getStackTrace();
            }finally {
                try {

                }catch (Exception e){
                    e.getStackTrace();
                }
            }
        }
    }
}
