package exception;

class A01 {
	public void test() {
		int num = 0;
		try {
			int re = 10 / num;
			System.out.println("문제 없을 경우");
		} catch (Exception e) {
			System.out.println("문제 있을 경우");
			// e.printStackTrace();
		} finally {
			// 문제가 있던지 없던지 항상 실행되는 곳
			System.out.println("finally 실행");
		}
		System.out.println("다음 문장 실행");
	}
}

public class MainClass01 {

	public static void main(String[] args) {
		
		A01 a = new A01();
		a.test();
		
		
	}
}
