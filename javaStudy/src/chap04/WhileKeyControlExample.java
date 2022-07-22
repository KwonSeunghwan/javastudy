package chap04;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {  //JVM이 예외처리를 해달라
		// 규칙 : 1: 증속, 2: 감속, 3: 중지
		// 반복문을 무조건 계속 반복을 하고, 어떤 조건이 되면 반복문을 종료하도록 flag를 선언
		boolean run = true;  // 반복조건에 들어가는 변수
		int speed = 0;       // 자동차의 속도
		int keycode = 0;     // 사용자로부터 키보드 입력값을 저장
		
		while(run) {
			// 반복실행하는 실행문
			// 현재는 무한 반복을 수행 : 곤란 -> 주의한다. -> 어떤 조건에서 종료되도록 프로그램을 한다.
			// CPU 점유율이 100%되고 다른 프로세스가 일을 할 수 없음
			// IO 동작은 키보드로부터 엔터키가 입력이 되어야함 입력을 시작 (불필요한 입력이 발생 : 13('\r'), 10('\n')
			if(keycode != 13 && keycode != 10) {    // 키보드로 입력받을 때 엔터키를 입력해야 동작
				//메뉴출력
				System.out.println("----------");   //println : 자동으로 줄을 바꿔줌
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------");
				System.out.print("선택: ");          // print 메소드를 사용: 커서를 유지하려고
			}
			keycode = System.in.read();  // 키보드로부터 입력 -> IO동작을 하는 경우는 예외가 발생할 수 있으므로 
			                             // 예외 처리를 해주어야 한다.
		if(keycode == 49) { // '1'
			speed++;
			System.out.println("현재 속도 = " + speed);
		} else if(keycode == '2') {  // 감속
			// -속도가 되지 않도록 추가로 고려해 주어야 한다. (고급 기술자)
		   if(speed ==0) {
			   System.out.println("감속할 수 없습니다.");
			   continue;    // 밑의 프로그램 부분을 실행하지 않고 다음 조건식으로 진행
		   }
			speed--;
			System.out.println("현재 속도 = " + speed);
		} else if(keycode == '3') { // 중지
			// 반복문을 벗어나려면 break문을 써도 되지만, run = false;
			run = false;    // 반복조건을 false -> 반복문을 벗어나게
		} else {    // '\r', '\n'
			System.out.println("올바른 메뉴를 입력하세요.");
		}
		System.out.println("프로그램 종료");
		
		// do-while문을 사용할 수 있다. -> 무조건 동작을 하려면 키보드로 메뉴를 입력받아야 하므로
		}

	}

}
