package chap18.file;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// try-with-resources : ()안에 I/O 객체를 생성하면 자동으로 close()를 호출해 준다.
		try (FileInputStream fis = new FileInputStream("C:/Temp/FileInputStreamExample.java")) {
			int data;
			while ((data = fis.read()) != -1) {	// 한 바이트씩 읽기 : EOF을 만날 때까지
				System.out.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}