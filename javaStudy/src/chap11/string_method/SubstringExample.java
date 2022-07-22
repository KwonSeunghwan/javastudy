package chap11.string_method;

public class SubstringExample {

	public static void main(String[] args) {
		// substring : 문자열의 일부분을 추출 (범위)
		String ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6);	// 6은 포함이 안된다. (6: '-')
		String secondNum = ssn.substring(7);	// 7뒤에 있는 것을 모두 가져온다.
		System.out.println(firstNum + " " + secondNum);
		System.out.println(ssn);
	}

}
