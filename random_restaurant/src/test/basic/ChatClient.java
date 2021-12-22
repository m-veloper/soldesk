package test.basic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable{

	// 화면 구성
	// 클라이언트에서 값을 보내고 받는걸 조금 쉽게 확인하기 위해서
	// 만든 Frame이므로 외울 필요없다. 일단 따라서 쓰고 보내는버튼(send_bt)과
	// 보여지는 화면(area)가 뭔지만 알고가자. 실전에서 jFrame안쓴다.
	JTextArea area;//메시지를 화면에 출력하는 공간
	JTextField input;
	JButton send_bt;//메시지 전송버튼
	JPanel south_p;

	// 서버 접속을 위한 객체
	Socket s;
	BufferedReader in;
	PrintWriter out;
	Thread t;

	public ChatClient(){
		area = new JTextArea();
		this.add(area);

		// BorderLayout배치관리자로 지전된 JPanel 생성
		south_p = new JPanel(new BorderLayout());
		south_p.add(input = new JTextField());// 패널객체의 가운데 추가
		south_p.add(send_bt = new JButton("보내기"),
				BorderLayout.EAST);

		this.add(south_p, BorderLayout.SOUTH);

		// 이벤트 감지자 등록
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// 종료하기 전에 서버 접속 해제
				// 종료 메세지를 보낸다.(서버의 스레드를 소멸시키기 위				함이다.)
				out.println("xx:~X");//종료시 xx:~X라는 메시지 전달
				// 위의 메세지가 서버로 갔다가 다시
				// 스레드 쪽으로 돌아온다.
			}
		});

		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				sendData();//서버로 메시지를 전달하기 위한 메서드			
			}
		});

		setBounds(100, 100, 400, 500);
		setVisible(true);

		connected(); // 서버 접속

		//서버로부터 전달되는 메세지를 감지하여 받는 스레드 생성
		t = new Thread(this);
		t.start();
	}

	private void connected(){
		try {		
			// 서버 접속
//			s = new Socket("172.16.10.17", 3200);
			s = new Socket("172.16.10.108", 3400);
			in = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new ChatClient();
	}

	@Override
	public void run() {
		// 서버로부터 전달되는 메세지를 기다렸다가
		// 메세지가 도착하면 화면에 출력
		while(true){
			try {
				String msg = in.readLine();// 대기상태
				if(msg.equals("xx:~X"))		
					break;

				if(msg != null)
					area.append(msg+"\r\n");//\r\n:윈도우에서 다음라인으로 넘어가기

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		closed();//열려있는 스트림을 닫는 메서드
		System.exit(0); // 프로그램 종료!!
	}

	private void sendData(){
		String msg = input.getText().trim();
		if(msg.length() > 0){
			// 한글자라도 입력했을 때 서버로 보내기
			out.println(msg);
		}
		input.setText("");//청소!!
	}

	private void closed(){
		try {
			if(out != null)
				out.close();
			if(in != null)
				in.close();
			if(s != null)
				s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
