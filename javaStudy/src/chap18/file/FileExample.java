package chap18.file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if (dir.exists() == false) {
			dir.mkdirs();	// 경로까지의 없는 폴더를 모두 생성해 준다.
		}
		// 사용 예) 프로그램 사용할 때 다른 프로그램이 중복해서 수행되지 않도록 lock을 걸어줄 수 있는데,
		// 그때 빈 파일을 생성해서 lock을 걸어준다.
		if (file1.exists() == false) {file1.createNewFile();}	// 빈 파일을 만들어 준다.
		if (file2.exists() == false) {file2.createNewFile();}
		if (file3.exists() == false) {file3.createNewFile();}
		
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles();	// 산하의 파일 목록을 가져왔다.
		System.out.println("날짜 시간 형태 크기 이름");
		System.out.println("-------------------------------------------------------------------");
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t" + file.getName());
			} else {
				System.out.print("\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}