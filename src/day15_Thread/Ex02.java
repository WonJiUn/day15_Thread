package day15_Thread;

class A02 extends Thread{
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("A02 : " + i);
		}
	}
}
class B02 extends Thread{
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("B02 : " + i);
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		A02 a = new A02();
		B02 b = new B02();
		
		a.setDaemon(true);		//메인이 종료될때 종속되어있는 쓰레드들도 같이 종료하도록 함
		b.setDaemon(true);
		
		a.start();
		b.start();
		
		//Thread를 상속받고 run이라는 메소드를 만들어서 start를 호출하면 된다
		
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
		System.out.println("프로그램 종료합니다");
		
	}
}
