package thread;

import java.util.Scanner;

class A02 extends Thread {
	public void run() {
		while (true) {
			System.out.println("출력 공간");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class MainClass02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = null;

		A02 a = new A02();
		a.start();

		while (true) {
			System.out.println("입력");
			s = scan.next();
			System.out.println(s);

			// 채팅 >> 내가 입력한게 먼저 올라와야하는건지 아니면 상대방이 입력한게 먼저 올라와야할지 모름
			// 일반적인 1개의 thread는 하나의 기능이 종료돼야 다음 기능을 실행하기 때문에 적절하지 않음
		}

	}
}
