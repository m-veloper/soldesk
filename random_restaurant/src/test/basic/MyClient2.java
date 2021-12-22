package test.basic;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient2 {

	public static void main(String[] args) {
		
		System.out.print("메세지 입력 : ");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine();
		
		if(msg != null && msg.trim().length() > 0) {
			
			Socket s=null;
			
			try {
				//서버의 아이피와 포트
				s=new Socket("172.16.10.109", 3001);
				
				//문자열을 서버로 보내기 위해서 스트림 준비
				PrintWriter out=new PrintWriter(s.getOutputStream());
				//서버로 문자열 보내기
				out.write(msg);
				
				//스트림에 적재한 내용을 비움
				out.flush();
				
				if(out != null)
					out.close();//스트림 닫기
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}finally {
				try {
					if( s !=null)
						s.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
