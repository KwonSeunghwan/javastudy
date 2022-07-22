package chap18.io_introduction;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * OutputStream : 바이트 단위로 출력하는 최상위 추상 클래스
 * OutputStream 클래스를 상속해서 클래스를 만든다.
 *  - FileOutputStream : 파일에 출력
 *  - BufferedOutputStream : 버퍼를 사용해서 출력 성능을 높일 때
 *  - DataOutputStream : 데이터 타입 형태로 출력할 때 -> 순서가 중요하다. (쓰고 읽을 때)
 *   + int int byte byte -> int int byte byte
 *  - ObjectOutputStream : 객체 단위로 출력
 *  - 제공되는 메소드 :
 *   + write(ch) : 한 바이트를 쓰기
 *   + write(byte[] bytes) : 배열 단위로 쓰기 -> 반환값은 쓴 바이트 수
 *   + write(byte[] b, int offset, int len) : 배열의 일정한 크기를 쓸때
 *   + flush() : 버퍼에 저장된 데이터를 출력을 하도록 요청을 할 때 사용
 *   + close() : 자원 반납
 */

public class WriteExample1 {

	public static void main(String[] args) throws IOException {
		// 예외 처리가 필요한 이유 : 쓰기 금지가 되어 있을 경우, I/O 동작 중 예외 발생(선이 끊어진다.)
		// 파일 시스템의 여유공간이 부족할 경우
		// 쓰기
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);	// 한 바이트 씩 출력
		}
		os.flush();
		os.close();
	}
}
