package chap18.assist_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws IOException {
		int data = -1;
		long start = 0;
		long end = 0;
		
		// 버퍼를 사용하지 않은 경우
		File file = new File("src/chap18/assist_stream/forest.jpg");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("C:/Temp/forest.jpg");
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1)
			fos.write(data);
		fos.flush();
		fos.close();
		bis.close();
		fis.close();
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		
		// BufferedOutputStream을 사용 -> 약 100배 정도 성능 향상을 가져올 수 있다. 
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/forest.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1)
			bos.write(data);
		bos.flush();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end - start) + "ms");
	}
}