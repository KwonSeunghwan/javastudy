package chap18.assist_stream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serializable interface를 구현하지 않은 Parent 클래스를 상속을 하고
// Serializable interface를 구현
public class Child extends Parent implements Serializable {
	public String field2;

	// 부모 클래스를 Serializable interface를 구현하지 않은 경우 추가로 작업을 해야 한다.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1); 		// 부모 필드를 직접 써줌
		out.defaultWriteObject();
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		field1 = in.readUTF(); 		// 부모 필드를 직접 읽어옴
		in.defaultReadObject();
	}
}
