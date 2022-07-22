package chap18.assist_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC classC = new ClassC();
		classC.field1 = 1;
		oos.writeObject(classC);
		oos.flush();
		oos.close();
		fos.close();
	}
}