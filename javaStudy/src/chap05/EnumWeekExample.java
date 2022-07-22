package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 지금 시각을  가져오기 위해 Calendar 클래스 -> 추상 클래스
		// 자식 객체를 사용해서 시간 정보를 가져올 수 있다.
		Week today = null;	// 참조 변수
		
		Calendar cal = Calendar.getInstance();	// Calendar 클래스의 자식 클래스를 가져온다.
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 요일 정보를 가져온다. SUNDAY(1)
		switch(week) {
		case 1: // 일요일
			today = Week.SUNDAY;	// 프로그램의 의미를 부여할 수 있다.
									// today = 5(?) -> FRIDAY -> enum을 사용
			break;
		case 2: // 월요일
			today = Week.MONDAY;
			break;
		case 3: // 화요일
			today = Week.TUESDAY;
			break;
		case 4: // 수요일
			today = Week.WEDNESDAY;
			break;
		case 5: // 목요일
			today = Week.THURSDAY;
			break;
		case 6: // 금요일
			today = Week.FRIDAY;
			break;
		case 7: // 토요일
			today = Week.SATURDAY;
			break;
		}
		// 오늘이 무슨 요일인지 저장을 하고 
		System.out.println("오늘의 요일: " + today);	// today에 어떤 값이 저장될지 모르는 경우에 에러가 발생
		// 오늘의  요일에 따라서 어떤 행위를 한다.
		if(today == Week.SATURDAY || today == Week.SUNDAY) {
			System.out.println("집에서 쉬면서 자습합니다.");
		} else {
			System.err.println("열심히 자바 공부를 합니다.");
		}

	}

}
