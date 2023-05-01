package exception;

class A04 {
	public void a01() throws Exception {
		a02();
	}

	public void a02() throws Exception {
		a03();
	}

	public void a03() throws Exception{
		System.out.println("a03실행");
		Thread.sleep(1000);
		// 메소드 내부에서 처리하는게 아닌 전가하기때문에
		// 이 메소드를 사용하는 다른 곳에서도 전가 처리를 해줘야한다
		
		// 메소드 내부에서 try/catch를 사용하면 다른곳에서는 예외처리를 안해도된다
		
		// 하나의 메소드 >> 예외전가가 더 편함
		// 여러개의 메소드 >> 예외처리가 더 편함
		
		System.out.println("a03종료");
		
		
	}
}

public class MainClass04{
	public static void main(String[] args) throws Exception {

		A04 a = new A04();
		a.a01();

	}
}
