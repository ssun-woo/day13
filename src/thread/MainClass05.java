package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			Date date = new Date();
			SimpleDateFormat s = new SimpleDateFormat("yyyy");
			String yearStr = s.format(date);
			int yearInt = Integer.parseInt(yearStr);
			int ff2 = 0;
			int idNum = 0;
			System.out.println("인증 프로그램 입니다");
			System.out.println("05년생 이상은 '가입불가'");
			System.out.println("04년생 이하는 '가입가능'");
			System.out.println("문자는 잘못 입력");
			System.out.print("주민번호 입력(앞7자리) : ");

			try {
				idNum = scan.nextInt();
				if(idNum < 0) {
					throw new Exception("음수는 입력할 수 없습니다");
				}
			} catch (InputMismatchException e) {
				System.err.println("숫자만 입력하세요!");
				scan.nextLine();
				continue;
			}catch (Exception e) {
				System.err.println(e.getMessage() + "\n");
				continue;
			}
			
			String idNum2 = idNum+"";
			
			if (idNum2.length() != 7) {
				System.err.println("길이가 틀렸습니다");
			} else {
				String secondFirst = idNum2.substring(6, 7);
				String firstFirst2 = idNum2.substring(0, 2);
				System.out.println(firstFirst2);
				if (secondFirst.equals("3") || secondFirst.equals("4")) {
					firstFirst2 = "20" + firstFirst2;
					ff2 = Integer.parseInt(firstFirst2);

					if ((yearInt - ff2) > 19) {
						System.out.println("가입 가능");
						System.out.println();
					} else {
						System.out.println("가입 불가");
						System.out.println();
					}

				} else if (secondFirst.equals("1") || secondFirst.equals("2")) {
					firstFirst2 = "19" + firstFirst2;
					ff2 = Integer.parseInt(firstFirst2);

					if ((yearInt - ff2) > 19) {
						System.out.println("가입 가능");
						System.out.println();
					} else {
						System.out.println("가입 불가");
						System.out.println();
					}
				} else {
					System.out.println("잘못된 입력입니다");
					System.out.println();
				}
			}

		}

	}
}
