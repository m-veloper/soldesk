package test.basic;

import java.awt.*;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) {
        System.out.println("메시지 입력 : ");
        Scanner scanner = new Scanner(System.in);

        String msg = scanner.nextLine();

        Socket socket = null;
        if (msg != null && msg.trim().length() > 0){
            try {
                // 서버와 아이피 포트
                socket = new Socket("172.16.10.109", 3001);

                // 문자열을 서버로 보내기
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

                // 서버로 전송
                printWriter.write(msg);

                // 스트림 비우기
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
