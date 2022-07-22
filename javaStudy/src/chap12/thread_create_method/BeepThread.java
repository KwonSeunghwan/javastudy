package chap12.thread_create_method;

import java.awt.Toolkit;

// 자식 스레드 : Thread 클래스를 상속 받는다.
public class BeepThread extends Thread {
	// Thread 클래스의 run 메소드를 재정의
	@Override
	public void run() {
		// 스레드가 실행되는 부분 : 스레드의 작업을 기술한다.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println("Runnable: run()이 실행됨");
			toolkit.beep();
			try {
				Thread.sleep(500); // 500ms 만큼 잠자기
			} catch (InterruptedException e) { // 잠자는 동안에 인터럽트로 다른 놈이 꺠울 수 있으며,
												// 이를 처리하도록 예외처리를 한다.
				;
			}
		}

	}
}
