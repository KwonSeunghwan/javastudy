package chap18.console;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutputExample {
	
	public static void main(String[] args) throws IOException {
		// 부모 클래스 = 자식 클래스
		OutputStream os = System.out;	// 표준 출력 장치 : 모니터
		// 이클립스에서는 Console 뷰를 말한다.
		
		for (byte b = 48; b < 58; b++)	// '0'~'9'
			os.write(b);
		os.write(10);	// '\n' 출력(줄바꾸기)
		
		for (byte b = 97; b < 123; b++)	// 소문자
			os.write(b);
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		
		// System.out.println() -> 내부적으로는 OutStream을 사용한다.
	}
}