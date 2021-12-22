package test.basic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{
	ServerSocket ss;
	ArrayList<CopyClient> list;

	public ChatServer() {
		try {
			
			list = new ArrayList<CopyClient>();//리스트 생성
			ss = new ServerSocket(3200);

			// ServerSocket이 생성되었다는 이유만으로
			// 서버의 기능이 완료된 것이다.
			System.out.println("서버 시작!");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		new ChatServer().start();
	}

	//언제 접속할지 모르는 클라이언트를 받아들이기 위해 Thread에서 구동
	@Override
	public void run() {
		// 접속자를 기다린다.
		while(true){
			try {
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");
				
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();// 클라이언트의 복사본의 스레드 구동!!
				//이렇게 해야 copy클라이언트의 스레드에서
				//inputStream을 통해 클라이언트로부터 넘어온 값을 
				//처리할 수 있다.

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void sendMessage(String msg){
		// 접속자들은 CopyClient로 만들어져서 ArrayList에
		// 모두 저장된 상태다.
		try {
			for(CopyClient cc : list){
				cc.out.println(msg);//서버의 접속자들에게 메세지 전달!
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void removeClient(CopyClient cc){
		list.remove(cc);// 인자로 전달된 CopyClient객체를
				// ArrayList에서 삭제!!
		sendMessage("☆★☆★"+cc.ip+"님 퇴장!☆★☆★");
		//위는 남아있는 구성원들에게 퇴장메세지 전달!
	}
	///////////////////////////////////////////////////////////////////
}

