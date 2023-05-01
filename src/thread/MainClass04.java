package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread {
	JFrame frame;
	JLabel label;

	SimpleDateFormat s = new SimpleDateFormat("aa hh시 mm분 ss초");

	public A04() {
		frame = new JFrame("label example");
		Container con = frame.getContentPane();
		label = new JLabel("test label");
		con.add(label);
		Font font = new Font(null, Font.ITALIC, 32);
		label.setFont(font);
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * frame.setVisible(true); 
		 * for(int i=0; ;i++) { 
		 * 		label.setText(i+".변경"); 
		 * }
		 */
	}

	public void run() {
		// 이름은 반드시 run이 들어가야 한다
		frame.setVisible(true);
		for (int i = 0;; i++) {
			long time = System.currentTimeMillis();
			label.setText(s.format(time));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MainClass04 {
	public static void main(String[] args) {

		A04 a = new A04();
		// a.start();
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		int choice;
		String id = null;
		String pwd = null;

		while (true) {
			System.out.println("1. 로그인 2. 가 입 3. 종료");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("-----------");
				System.out.println("로그인");
				System.out.println("-----------");

				System.out.print("아이디 입력 : ");
				id = scan.next();
				System.out.print("비밀번호 입력 : ");
				pwd = scan.next();

				if (!map.containsKey(id) || !map.get(id).equals(pwd)) {
					System.out.println("아이디와 비밀번호를 확인해주세요");
				} else {
					System.out.println("로그인 됐습니다");
					a.start();
				}
				break;
			case 2:
				System.out.println("-----------");
				System.out.println("가 입");
				System.out.println("-----------");
				System.out.print("아이디 입력 : ");
				id = scan.next();
				while (map.containsKey(id)) {
					System.out.println("이미 존재하는 아이디 입니다");
					System.out.print("아이디 입력 : ");
					id = scan.next();
				}
				if (!map.containsKey(id)) {
					System.out.print("비밀번호 입력 : ");
					pwd = scan.next();

					map.put(id, pwd);
					System.out.println("가입되었습니다");
				}
				break;

			case 3:
				System.out.println("-----------");
				System.out.println("종료");
				System.out.println("-----------");
				System.exit(1);
				break;
			default:
				break;
			}
		}

	}
}
