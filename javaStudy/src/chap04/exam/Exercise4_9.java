package chap04.exam;

public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
//			char ch = str.charAt(i);	// 하나의 문자를 구한다.
//			int number = ch - '0';
//			sum += munber;
			sum += str.charAt(i) - '0';
		/*
		(1) . 알맞은 코드를 넣어 완성하시오
		*/
		}
		
		System.out.println("sum="+sum);

	}

}
