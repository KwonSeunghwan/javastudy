package chap18.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		// 문자열 배열의 크기로 읽는다. : 문자열 배열의 크기를 얼마로 할 것인가? -> 성능의 영향을 준다.
		// 키보드 : 모니터로 출력 -> 80, 132, 512
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while (true) {
			readCharNo = reader.read(cbuf);
			if (readCharNo == -1)
				break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
	}
}