package test.basic;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient2 {

	public static void main(String[] args) {
		
		System.out.print("�޼��� �Է� : ");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine();
		
		if(msg != null && msg.trim().length() > 0) {
			
			Socket s=null;
			
			try {
				//������ �����ǿ� ��Ʈ
				s=new Socket("172.16.10.109", 3001);
				
				//���ڿ��� ������ ������ ���ؼ� ��Ʈ�� �غ�
				PrintWriter out=new PrintWriter(s.getOutputStream());
				//������ ���ڿ� ������
				out.write(msg);
				
				//��Ʈ���� ������ ������ ���
				out.flush();
				
				if(out != null)
					out.close();//��Ʈ�� �ݱ�
				
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
