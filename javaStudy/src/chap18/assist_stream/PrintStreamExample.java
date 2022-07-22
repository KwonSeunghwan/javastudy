package chap18.assist_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream에서 제공하는 메소드 : print(), println(), printf()
 * printf() : 서식
 */
public class PrintStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		// 서식을 제공 : -왼쪽 정렬, 5: 5글자 동간을 차지
		// d : decimal(정수), s : string, f : float(실수), c : char
		// & 서식 하나에 뒤에 변수 하나씩 대응
		ps.printf("%-5d\t%s\t%f\t%c", 10, "홍길동", 5.5, 'c');
		
		ps.flush();
		ps.close();
		fos.close();
	}
}