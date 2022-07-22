package chap18.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		File file = new File("src/chap18/file/house.jpg");	// 상대 경로
		System.out.println(file.getAbsolutePath());	// 파일의 절대경로를 출력
		String targetFileName = "C:/Temp/house.jpg";	// 저장하는 위치
		try (FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(targetFileName);) {
			int readByteNo;
			byte[] readBytes = new byte[100];
			while ((readByteNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteNo);	// 읽은 바이트 수 만큼 쓰기
			}
			fos.flush();
			System.out.println("복사가 잘되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}