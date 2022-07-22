package chap18.assist_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * BufferedReader : Reader를 통해서 읽은 문자열을 버퍼를 사용하여 성능 향상을 한다.
 * 빠른 처리를 하는 CPU와 느린 처리를 하는 I/O 장치간의 완충역할을 하는 버퍼를 사용해서 성능 향상을 한다.
 */

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;	// 키보드 : 바이트 단위로 처리
		Reader reader = new InputStreamReader(is);	// 문자 단위로 처리
		BufferedReader br = new BufferedReader(reader);	// 버퍼를 사용 -> 3단계
		
		System.out.print("입력: ");
		String lineString = br.readLine();
		
		System.out.println("출력: " + lineString);
	}
}