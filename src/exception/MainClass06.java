package exception;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s1 = null, s2 = null;
		
//		System.out.println("1.입력");
//		s1 = scan.next();
//		System.out.println("2.입력");
//		s2 = scan.next();
//		// 공백을 입력하면 2.입력이 제대로 동작하지 않음
//		// next가 공백(스페이스바)도 구분자로 인식하기 때문에 그렇게 처리됨
//		
//		System.out.println("s1 : " + s1);
//		System.out.println("s2 : " + s2);
		
		
		System.out.println("1.입력");
		s1 = scan.nextLine();
		System.out.println("2.입력");
		s2 = scan.nextLine();
		// nextLine을 사용하면 공백이 아닌 enter값만 구분자로 인식함
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		
		
		
	}
}
