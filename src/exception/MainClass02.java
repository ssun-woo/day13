package exception;

import java.util.Scanner;

class A02 {
	public void test() {

		Scanner scan = new Scanner(System.in);
		// 입출력받는 모든것 > 스트림(연결시켜주는 통로)

		try {
			System.out.println("문제가 발생하지 않으면");
			return; // 해당 메소드를 빠져나옴
		} catch (Exception e) {
			System.out.println("문제가 발생하면");
		} finally {
			System.out.println("마지막에 해야하는 작업");
			// 중간에 return을 만나도 finally 까지는 실행이 됨

			scan.close();
			// 종료시킴으로써 자원을 효율적으로 사용함
		}

		System.out.println("다음 문장들 실행");
		return;
	}

}

public class MainClass02 {
	public static void main(String[] args) {

		A02 a = new A02();
		a.test();

	}
}
