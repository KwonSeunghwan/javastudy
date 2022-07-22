package chap11.date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

// 날짜 다루는 클래스 : Date, Calendar
// Date : 1970년 1월 1일 0시를 0으로 해서 그 이후의 ms단위의 시간을 나타낸다.
public class DateExample {
	
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); 	// now.toString() 호출 -> 현재시간을 출력
		// Date 클래스에서 toString 메소드가 재정의 되어 있음
		long value = now.getTime(); // 1970년 1월 1일 이후 몇 ms가 지났는지 하는 값이 저장됨.
		System.out.println(value); 	// 1.65 * 10의 9승 초가 지났음.
		
		// 한국사람이 이해할 수 있는 시간 형태로 출력을 하려면 SimpleDateFormat 객체를 이용한다.
		// 출력할 형식을 지정
		// yyyy : year 4자리, 2자리 -> yy
		// MM : month, mm : minute
		// dd : date
		// HH : 24시간 시간 표기법 0~23 Hour
		// ss : second
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(now));
	}

}
