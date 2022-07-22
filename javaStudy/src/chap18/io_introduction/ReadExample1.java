package chap18.io_introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		// 한 바이트씩 읽기
		// InputStram은 추상 클래스이므로 객체를 할 수 없고, 상속한 클래스를 통해서 I/O 동작을 해야 한다.
		InputStream is =new FileInputStream("C:/Temp/test.txt");	// 예외처리를 해준다.
		int readByte;
		while(true) {
			readByte = is.read();	// read() : 한 바이트씩 읽는다. -> 반환형은 int
			if(readByte == -1) {	// -1 : EOF(End Of File) -> 데이터의 맨 끝
				break;	// 데이터를 다 읽었으므로 반복문을 종료
			}
			System.out.println((char)readByte);
		}
		is.close(); // 자원을 반납

	}

}
