package chap18.console;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;	// 키보드로 부터 읽는다.
		
		byte[] datas = new byte[100];
		
		System.out.print("이름: ");
		// 주의해야 할 사항 : '\r\n'이 같이 읽혀지므로 문자열로 변환하여 저장할 때 삭제해 준다.
		int nameBytes = is.read(datas);	// '\r\n' 같이 읽혀진디.
		String name = new String(datas, 0, nameBytes - 2);	// '\r\n'을 제거
		
		System.out.print("하고 싶은말: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes - 2);
		
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은말: " + comment);
	}
}