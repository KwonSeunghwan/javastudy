package chap12.thread_create_method;

import java.awt.Toolkit;

/* 어플리케이션이 동작을 하면 main 메소드가 실행이 된다.
 * main 메소드가 동작하는 것을 main 스레드라고 한다.
 * 병렬처리 작업을 위해서 스레드를 생성하고 실행한다.
 * 
 * Thread를 만드는 방법 : 2가지
 * 1. Thread를 상속해서 자식 스레드를 만드는 방법
 * 2. Runnable 인터페이스를 구현한 구현 객체를 스레드 매개변수로 주는 방법
 */

public class ThreadCreateExample {

	public static void main(String[] args) {
		// 방법 1. Runnable 인터페이스를 사용하는 방법
		// 방법 1-1 별도의 구현 클래스 파일을 정의하는 방법
		/*
		 * Runnable runnable = new BeepTask(); // 인터페이스 = 구현 객체를 대입 Thread thread = new
		 * Thread(runnable); // 스레드 객체를 만들면서 Runnable 구현객체 매개변수로 전달 thread.start(); //
		 * BeepTask 구현 객체의 run() 메소드가 실행된다.
		 */

		// 방법 1-2 : 구현 객체를 만들지 않고 익명 구현 객체를 사용
		Thread thread = new Thread(new Runnable() { // 익명 구현 객체 -> 별도의 구현 객체를
			// run 메소드를 재정의 : 스레드 작업을 수행

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
		});
		thread.start();

		// 방법 1-3 : 람다식을 이용 : 익명 구현 객체의 메소드가 하나만 존재할 때 람다식으로 표현 가능
		// 람다식 표기법은 익명 구현 객체를 람다식으로 표현 했기 때문에 구현 객체의 동작 방법을 이해하면 된다.

		// main 스레드의 작업을 병행
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			} // 잠자기
		}

	}

}
