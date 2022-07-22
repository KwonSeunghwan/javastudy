package chap11.date_calendar;

import java.util.Calendar;

public class CalendarExample {
	
	public static void main(String[] args) {
		// 시간을 계산할 때 사용
		Calendar now = Calendar.getInstance();	// Calendar : 추상클래스
			// 자식 객체를 getInstance() 메소드를 사용하며 얻는다.
		int year = now.get(Calendar.YEAR);	// 년도 획득
		int month = now.get(Calendar.MONTH);	// 0~11 : +1
		int day = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);	// HOUR : 12시간, HOUR_OF_DAY : 24시간
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		Calendar nextYear =Calendar.getInstance();
		nextYear.set(2023, 06, 14);	// 시간을 내년 시간으로 설정
		System.out.println(nextYear);
		
	}

}
