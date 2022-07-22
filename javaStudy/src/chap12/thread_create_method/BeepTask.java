package chap12.thread_create_method;

import java.awt.Toolkit;

// 구현 객체 -> 스레드 작업을 하는 객체
public class BeepTask implements Runnable {
	// Runnable 인터페이스의 추상 메소드 : 스레드의 작업을 수행
	@Override
	public void run() {
		// 스레드가 동작한다. -> 스레드가 작업해야될 것을 프로그램 한다.
		// run() 메소드가 종료되면 스레드가 종료된다.
		// 예) 5회동안 500ms마다 비프음을 낸다.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0;i < 5;i++) {
			System.out.println("Runnable: run()이 실행됨");
			toolkit.beep();
		try {
			Thread.sleep(500);	// 500ms 만큼 잠자기
		} catch (InterruptedException e) {	// 잠자는 동안에 인터럽트로 다른 놈이 꺠울 수 있으며, 
												//이를 처리하도록 예외처리를 한다.
			;
		}	// 잠자기 -> 예외 처리
		
		}
	}
}
