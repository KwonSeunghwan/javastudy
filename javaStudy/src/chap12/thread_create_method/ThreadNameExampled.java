package chap12.thread_create_method;

public class ThreadNameExampled {

	public static void main(String[] args) {
		// main 스레드 
		Thread mainThread = Thread.currentThread();	// 내가 동작하는 스레드 정보를 가져온다.
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName() );
		
		// 스레드를 생성하고  실행
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();


	}

}
