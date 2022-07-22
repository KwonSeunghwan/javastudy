package chap18.io_introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		// 일정 크기만큼 읽을 때
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3);	// 3바이트 읽기
		for (int i = 0; i < readBytes.length; i++)
			System.out.println(readBytes[i]);
		is.close();
	}
}