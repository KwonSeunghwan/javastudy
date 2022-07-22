package chap11.etc;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";	// 서울/휴대폰에 대한 정규표현식(Regular Expression)
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// 정규표현식 -> 정해진 샘플이 많이 있으므로 나에 맞는 것이 어떤 것인지 검색을 통해 찾는다.
		// 어떤 형식을 사용할 것인가를 먼저 결정을 한다.
		// 예, 비밀번호 : 영문자로만 할 것인가? 영문자와 숫자를  조합할 것인가? 특수문자를 포함시킬것인가?를 정해야 한다.
		// 최소 몇자 이상 최대 몇자까지 입력할 것인가?를 정해야 한다.
		// 자바 언어냐? 자바 스크립트냐에 따라서 체크하는 메소드 차이가 있
		regExp="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data="angel@navercom";
		result=Pattern.matches(regExp,data);
		if(result){
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}

}
