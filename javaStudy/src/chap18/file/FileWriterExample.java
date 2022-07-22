package chap18.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		File directory = new File("C:/Temp");
		if (!directory.exists()) {
			directory.mkdir();
		}
		File file = new File(directory, "file.txt");
		FileWriter fw = new FileWriter(file, true);	// true : append
				// 파일이 존재하지 않으면, 새로 생성한다.
				// 파일이 존재하면, 그 파일의 뒤에 계속 추가한다.
				// true가 없으면(false), overwrite 한다. 엎어쓰기
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}