package chap18.exam.exercise15_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/*
 * 실행 방법 : java HexaViewer Hexaviewer.class -> args -> 파라미터 수 1개
 * 요구사항 : 한줄에 16개 Hexa로 출력
 * 힌트 : PrintStream과 printf() 메소드 사용
 * 파일을 읽어야 한다. -> 바이트, 문자? -> 바이트(.class파일이 바이트로 구성되어 있으므로 )
 * 		FileInputStream을 사용
 * 		한번에 16바이트씩 읽어야 겠다. -> 출력 -> 바이트 배열 -> 크기 16바이트 짜리
 * 		남는 바이트가 있으면 크만큼 읽어서 출력
 * 출력 : Hexa로 출력, 대문자로 출력, 0이 있으면 0도 출력을 해야 한다.
 */

public class Exercise15_2 {

	public static void main(String[] args) {
		// 올바르개 파라미터를 입력하는지 검사
		if (args.length != 1) {
			System.out.println("사용방법: java HexaViewer Hexaviewer.class");
			System.exit(-1); // 종료 코드 : -1 (파라미터 잘못 입력)
		}
		// 입력한 파일이 존재하는지 확인
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("올바른 파일명을 입력하세요.");
			System.exit(-2); // 종료 코드 : -2 (잘못된 파일 명을 입력한 경우)
		}
		// 16바이트씩 읽어서 출력을 한다. -> 반복문을 사용
		// 입력 방법 : FileInputStream
		// 출력 방법 : PrintStream
		try (FileInputStream fis = new FileInputStream(file); PrintStream ps = new PrintStream(System.out)) {
			// 읽어들인 데이터를 저장할 변수를 선언
			byte[] inputs = new byte[16]; // 16바이트씩 읽는다.
			int readBytes; // 읽은 바이트 수 : 남은 바이트 수가 얼마인지? 저장
			while ((readBytes = fis.read(inputs)) != -1) { // EOF일때까지 읽는다.
				// 출력한다. -> 반복문을 사용해서 읽은 바이트 수만큼 출력
				int i;
				for (i = 0; i < readBytes -1; i++) {
					// %x : hexa로 출력(소문자), %X : hexa (대문자)
					// 출력되는 문자의 수 : 2
					ps.printf("%02X ", inputs[i]);
				}
				// 마지막 바이트 출력
				ps.printf("%02X\n", inputs[i]); // 변수 i가 필요함 -> for문 전에 선언
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
