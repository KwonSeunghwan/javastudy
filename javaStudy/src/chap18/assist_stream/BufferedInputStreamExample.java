package chap18.assist_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * Buffered : InputStream이나 Reader에 버퍼를 사용해서 성능향샹을 시키는 목적으로 사용
 */

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		long start = 0, end = 0;
		
		File file = new File("src/chap18/assist_stream/forest.jpg");
		FileInputStream fis1 = new FileInputStream(file);
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {	// EOF까지 읽어준다.
		}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		fis1.close();
		
		// 성능 향샹을 위해서 BufferedInputStream을 사용 : 100배 정도 빠르게 처리
		FileInputStream fis2 = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
		}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end - start) + "ms");
		bis.close();
		fis2.close();
	}
}