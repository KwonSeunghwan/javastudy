package chap18.assist_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		// 콘솔로부터 바이트 형태로 읽어 문자열 형태로 변환하는 보조 스트림
		// 바이트 -> 문자 형태로 변환
		InputStream is = System.in;	// 바이트 형태로 읽는 클래스
		Reader reader = new InputStreamReader(is);	// 문자열 형태로 읽는 클래스
		// Reader reader = new InputStreamReader(System.in);
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = reader.read(cbuf)) != -1) { // EOF(control+z)
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
		// 이클립스 콘솔창에서 EOF을 입력하는 방법 : control+z를 입력
	}
}