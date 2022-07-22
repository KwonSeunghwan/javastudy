package chap18.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		writer.write(data);	// 문자열 배열로 쓴다.
		writer.flush();
		writer.close();
	}
}
