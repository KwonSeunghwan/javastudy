package chap12.thread_create_method;

import java.awt.Toolkit;

public class ThreadCreateExample2 {

	public static void main(String[] args) {
		// 2. 스레드 생성 방법 : 자식 스레드를 만들어서 생성하는 방법
		// 2-1 자식 스레드를 별도의 파일로 정의해서 사용
		/*
		 * Thread thread = new BeepThread(); // 부모클래스 Thread = 자식 클래스 BeepThread
		 * thread.start();
		 */

		// 2-2 익명 객체를 사용하는 방법
		Thread thread = new Thread() {
			// Thread 클래스의 run 메소드를 재정의
			@Override
			public void run() {
				// 스레드 작업
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					System.out.println("Runnable: run()이 실행됨");
					toolkit.beep();
					// 500ms 만큼 잠자기
					try {
						Thread.sleep(500); // 500ms 만큼 잠자기
					} catch (InterruptedException e) { // 잠자는 동안에 인터럽트로 다른 놈이 꺠울 수 있으며,
														// 이를 처리하도록 예외처리를 한다.
						;
					}
				}
			}
		};
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			} // 잠자기

		}

	}
}
