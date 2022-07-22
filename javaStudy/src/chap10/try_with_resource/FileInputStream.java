package chap10.try_with_resource;

// 파일을 입력하는 동작을 하는 클래스를 정의
// try-with-resource 기능을 적용
// 기존에는 자원을 획득하고 finally에서 자원 반납을 해주었는데, finally 구문이 복잡하고, 반복된다.
// 핵심 프로그램을 작성하는 것보다 finally 구문을 작성하는 것이 오버헤드로 적용
// 자동으로 자원을 반납하면 좋겠다. -> try-with-resource 기능이 나왔다.
// I/O 처리하는 클래스는 보통 AutoClosable 인터페이스를 구현한다.

public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	// try-with-resource에 의하여 자원을 반환
	@Override
	public void close() throws Exception {	// 자원을 반납할 때 사용
		System.out.println(file + "을 닫습니다.");

	}

}
