package java200608;

public class ThreadExample {
	// 메인스레드
	/*public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}*/
	/*public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// 메인스레드가 1초간 멈춰있다가
			// print됨
			Thread.sleep(1000);
			System.out.println(i);
		}
	}*/
	/*public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}*/
	
	public static void main(String[] args) {
		// 쓰레드 사용
		//1. runnable인터페이스 구현
		/*for (int i = 1; i <=10; i++) {
			System.out.println("스레드");
		}*/
		// Runnable()하고 ctrl+1// ctrl+space+enter
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=10; i++) {
					System.out.println("스레드");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println("스레드");
				}
				
			}
		};
		Thread thread =new Thread(runnable);
		thread.start();
		
		//2. Thread 상속
		
		
		// 메인 쓰레드에서 실행
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
