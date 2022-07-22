package chap03;

public class StringCompareExample {

	public static void main(String[] args) {
		/* 문자열 비교
		 * ==, != : 주소를 비교
		 * equals 메소드를 사용해서 비교 : 내용을 비교
		 */
		
		String str1 = "강낭콩";    //리터럴(여러번(11, 12) 반복되더라도 한번만 저장이 된다)
		String str2 = "강낭콩";
		String str3 = new String("강낭콩");
		
		// 비교
		// 주소를 비교
		System.out.println(str1 == str2);  // true
		System.out.println(str1 == str3);  // false
		
		//내용을 비교 -> 논리적 동등 비교
		System.out.println(str1.equals(str2));  // true
		System.out.println(str1.equals(str3));  // true

	}

}
