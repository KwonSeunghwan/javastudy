package chap12.thread_create_method;

// 자식 스레드 
public class ThreadA extends Thread {
	// 생성자
	public ThreadA() {
		// 스레드 이름을 설정
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		for(int i = 0;i < 2;i++) {
			// 스레드 이름
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
