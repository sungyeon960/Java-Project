package java200608;

public class ThreadExample2 {
	public static void main(String[] args) {
		// 2. Thread상속
		/*
		 * Thread thread = new Thread() {
		 * 
		 * @Override public void run() {
		 * 
		 * } }; thread.start();
		 */ // 이것보다는아래거가 좋아
		new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("스레드");
				}
			}
		}.start();
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
