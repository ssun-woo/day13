package exception;

import java.util.Scanner;

// 강제예외 : 문법적으로는 오류가 아니지만 사용자의 의도와 다르게 사용될 때 사용

public class MainClass05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int age = 0;
		// 초기화를 안하면 try문에 무언가 안들어가면 값이 없음.(오류발생)

		System.out.println("나이 입력");

		try {
			age = scan.nextInt();
			if (age < 1) {
				throw new Exception("잘못된 입력");
			}
			System.out.println(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("다음 문장들 실행");
		// 음수를 입력해도 실행됨 >> 강제예외 처리
		
	}
}
