package chap18.assist_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;	// static 필드 -> 직렬화가 안됨 -> 사용하지 않는다.
		classA.field4 = 4;	// transient -> 직렬화가 안됨 -> 의미없이 사용한다.(영향이 없도록)
		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
		// Object.dat 파일은 객체를 직렬화하여 저장되었으며, 바이트의 연속으로 저장되었다.
		// 문자 형태로 읽을 수 없음. -> 다른 프로그램이 필요
	}
}