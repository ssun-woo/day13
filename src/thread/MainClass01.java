package thread;
/*
 thread : 프로세스의 단위(최소단위, 일꾼)
 		  하나의 class파일에 하나의 일꾼
 */

class A01 extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " : A01");
		}
	}
}

class B01 extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " : BBB01");
		}
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		
		A01 a = new A01();
		B01 b = new B01();
		
		// a.run();
		// b.run();
		// 하나의 thread가 있기 때문에 a.run()이 완전히 실행되고 끝난 후 b.run()으로 이동해서 실행한다
		// 한번에 하나의 작업밖에 못한다
		
		// 각각의 class에 Thread를 상속받으면 개별적으로 동작한다
		a.setDaemon(true);	// 나를 포함한 thread가 종료되면 해당 thread를 종료한다
		b.setDaemon(true);  // (main thread)가 종료되면, (a,b thread)가 종료됨
							// 이미 메모리에 올라와있는 값들은 출력된다
		a.start();
		b.start();
		// 메소드 실행이 아닌 start로 실행해야 한다
		System.out.println("main 종료==========");
		System.out.println("main 종료==========");
		System.out.println("main 종료==========");
		System.out.println("main 종료==========");
		// 순서가 뒤죽박죽으로 나옴 >> 각각의 일을 진행한다
		// multi thread(멀티 쓰레드)
		
		// 문제는 이렇게 실행하면 main이 종료돼도 thread가 실행되기 때문에 다른것들도 나온다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
