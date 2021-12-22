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
			
			list = new ArrayList<CopyClient>();//����Ʈ ����
			ss = new ServerSocket(3200);

			// ServerSocket�� �����Ǿ��ٴ� ����������
			// ������ ����� �Ϸ�� ���̴�.
			System.out.println("���� ����!");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		new ChatServer().start();
	}

	//���� �������� �𸣴� Ŭ���̾�Ʈ�� �޾Ƶ��̱� ���� Thread���� ����
	@Override
	public void run() {
		// �����ڸ� ��ٸ���.
		while(true){
			try {
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "�� ����");
				
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();// Ŭ���̾�Ʈ�� ���纻�� ������ ����!!
				//�̷��� �ؾ� copyŬ���̾�Ʈ�� �����忡��
				//inputStream�� ���� Ŭ���̾�Ʈ�κ��� �Ѿ�� ���� 
				//ó���� �� �ִ�.

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void sendMessage(String msg){
		// �����ڵ��� CopyClient�� ��������� ArrayList��
		// ��� ����� ���´�.
		try {
			for(CopyClient cc : list){
				cc.out.println(msg);//������ �����ڵ鿡�� �޼��� ����!
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void removeClient(CopyClient cc){
		list.remove(cc);// ���ڷ� ���޵� CopyClient��ü��
				// ArrayList���� ����!!
		sendMessage("�١ڡ١�"+cc.ip+"�� ����!�١ڡ١�");
		//���� �����ִ� �������鿡�� ����޼��� ����!
	}
	///////////////////////////////////////////////////////////////////
}

