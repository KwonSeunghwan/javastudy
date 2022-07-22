package chap12.thread_create_method;

// 자식 스레드 
public class ThreadB extends Thread {
	// 스레드를 생성하면 스레드 이름이 디폴트로 Thread-n
	@Override
	public void run() {
		for(int i = 0;i < 2;i++) {
			// 스레드 이름
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
