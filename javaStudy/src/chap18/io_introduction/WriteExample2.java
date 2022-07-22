package chap18.io_introduction;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data);
		os.flush();	// 버퍼에 저장된 내용을 빨리 써라.
		os.close();
	}
}
