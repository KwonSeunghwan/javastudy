package chap18.exam.exercise15_1;

import java.io.File;

public class Exercise15_1 {

	public static void main(String[] args) {
		// 사용법 : Java FileHead 10 FileHead.java
		// hint : BufferedReader의 readLine()을 사용
		if(args.length !=2) {
			System.out.println("USAGE: java FileHead 10 FILENAME");
			System.out.println(-1);
		}
		File file = new File(args[1]);
		System.out.println("절대경로: " + file.getAbsolutePath());
		// 이클립스를 사용하면 경로를 확인할 필요가 없다.
		// 상대경로 : src/chap18/exam/exercise15_1/Exercise15_1.java
		// 경로를 프로젝트 명인 javaStudy 밑에 파일이 존재하는 것으로 간주
		if(!file.exists()) || file.isDirectory() {
			System.out.println();
		}

	}

}

