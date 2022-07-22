package chap11.string_method;

public class ReplaceExample {

	public static void main(String[] args) {
		// replace : 문자열을 대체 -> 기존 문자열은 그대로 존재하고 새로운 대체된 문자열이 생성된다.
		String oldStr = "자바 프로그램";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);	// 기존 것은 그대로 있고
		System.out.println(newStr);	// 새로운 대체된 문자열이 생성된다.

	}

}
