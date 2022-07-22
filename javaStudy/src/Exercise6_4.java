

/*
 * 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
 */

public class Exercise6_4 {
	public static void main(String args[]) {

	Student s = new Student();
	s.name = "홍길동";
	s.ban = 1;
	s.no = 1;
	s.kor = 100;
	s.eng = 60;
	s.math = 76;
	
	System.out.println("이름 : " + s.name);
	System.out.println("총점 : " + s.getTotal());
	System.out.println("평균 : " + s.getAverage());
	
  }
}

    class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	// 메소드 반환형 메소드이름(매개변수) { }
	int getTotal() {
		// 국어, 영어, 수학
		return kor + eng + math;
	}

	float getAverage() {
		// 평균 : 총점/과목수 -> 소수점 둘째자리에서 반올림
		int sum = getTotal();
		// 소수점 둘째자리 : * 10 -> /10
		// 셋째자리까지 : * 100 -> / 100
		// 넷째자리까지 : * 1000 -> / 1000
		return (int)((sum / 3.0f) * 10 + 0.5f) / 10.0f; // 주의사항 : sum 또는 과목수가 float으로 해야 한다.
	}

}
