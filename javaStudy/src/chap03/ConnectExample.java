package chap03;

public class ConnectExample {

	public static void main(String[] args) {
		// 문자열 연결 연산자 : '+'
		// 문자열을 계속해서 이어 나갈 때 사용
		String str1 = "JDK" + 6.0;  // 문자열 + double = 문자열 + 문자열(형번환) = 연결되는 문자열이 생성된다.
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);

	}

}
