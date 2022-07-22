package chap11.string_method;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// 문자열을 분리하는 방법 : 디리미터를 사용
		// String split() 메소드를 사용
		// StringTokenzeier를 사용하는 방법
		String text = "홍길동&이수홍,박연수,김자바-최명호";	// 문자열은 디리미터로 구분된다.
		// 엑셀 테이블의 데이터를 파일로 저장할 때 : 셀에 있는 데이터를 구분해서 저장할 때(일반적으로 ,를 사용)
		String[] names = text.split("&|,|-");	// spilt 메소드의 매개변수는 정규표현식을 사용한다.
			// |을 사용해서 여러개의 디리미터를 구분 : & , -
		// split 메소드는 문자열 배열로 저장된다.
		for(String name : names) {
			System.out.println(name);
		}
		
		// StringTokenizer 클래스를 사용하는 방법
		String text2 = "홍길동/이수홍/박연수";	// 디리미터 '/'
		StringTokenizer st = new StringTokenizer(text2, "/");
		while(st.hasMoreElements()) {
			String token =st.nextToken();	// 문자열
			System.out.println(token);
		}
		
		// 데이터를 입력할 때 사용
		// 토큰의 갯수를 나타내는 countTokens() 메소드를 사용
		StringTokenizer st2 = new StringTokenizer(text2, "/");
		int countTokens = st2.countTokens();	// 토큰의 갯수
		for(int i = 0; i < countTokens; i++) {
			String token = st2.nextToken();
			System.out.println(token);
		}
	}

}
