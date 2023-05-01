package exception;

public class MainClass03 {

	public static void main(String[] args) throws InterruptedException {
												// 예외전가
												// java에 예외상황을 전가함
												// 당장에는 깔끔해 보일수는 있으나 불편할 수 있음

		System.out.println("시작");

		Thread.sleep(1000);

		System.out.println("끝");

	}
}
