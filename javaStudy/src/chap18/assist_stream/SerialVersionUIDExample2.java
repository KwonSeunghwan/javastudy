package chap18.assist_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1: " + classC.field1);
		// ClassC의 필드를 하나 더 추가하여
		// 쓸때 사용한 ClassC의 버전과 읽을 때 사용한 ClassC의 버전이 달라졌으므로 
		// 예외가 발생 : InvalidClassException -> 다른 클래스이다.
	}
}