package chap11.exam_exercise9_7;

public class Exercise9_7 {
	/*
	(1) contains . 메서드를 작성하시오
	*/
	static boolean contains(String src, String target) {	
	
		// 첫 번째 문자열(src)에 두 번째 문자열 (target)이 포함되어 있는지 확인한다.
		// 포함되어 있으면 true, 그렇지 않으면 false를 반환한다.
		// indexOf() 사용 : 없으면 -1
		if(src.indexOf(target) == -1) {
			return false;
		} else {
			return true;
		}
	}
		public static void main(String[] args) {
	System.out.println(contains("12345","23"));
	System.out.println(contains("12345","67"));

}

}