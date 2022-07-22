package chap18.reader;

/*
 * Writer : 문자 단위로 출력할 때 사용하는 최상위 추상 클래스
 * Writer 클래스를 상속해서 FileWriter, BufferedWriter, PrintWriter, OutputStreamWriter
 *  - FileWriter : 파일에 문자단위로 쓸 때(텍스트)
 *  - BufferedWriter : 버퍼를 이용해서 출력 성능을 높이고자 할 때 사용한다.
 *  - PrintWriter : 프린트처럼 동작
 *  - OutputStreamWriter : 문자 단위로 출력한다. 최종으로는 OutputStream이 바이트 단위로 출력
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		for (int i = 0; i < data.length; i++)
			writer.write(data[i]);	// 한 문자씩
		writer.flush();
		writer.close();
	}
}