package exception;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			try {
				System.out.print("수 입력 : ");
				num = scan.nextInt();
				System.out.println(num);
			}catch(Exception e) {
				scan.nextLine();
				
				System.out.println("문제 발생");
			}
			// 문자열을 입력하면 무한반복 발생
			// nextLine();을 통해 문제 해결
			// nextLine이 enter, space와같은 공백을 빼내옴
			
		}
		
	}
}
