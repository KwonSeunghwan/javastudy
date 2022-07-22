package chap04;

public class SwitchExample {

	public static void main(String[] args) {
		/*
		 * 조건문 : switch문
		 * 정형화가 되어 있으므로 if문 보다는 효과적(보기도 좋고)이다.
		 * 스위치문의 조건식에는 변수를 사용 : 셀수있는 것 (byte, char, int, long)
		 * float, double -> 오차가 있으므로 정확한 것을 비교할 수 없음 -> 사용 불가
		 * 문자열은 가능 : 비교할 수 있으므로
		 * age >= 18 && age < 20 : x (불가)
		 * 하나의 값만 가능
		 */
		int menu = 1;    // 키도드로부터 입력을 받는다.
		// 메뉴에 따라서 다른 처리를 할 경우 1: 통장 개설, 2: 입금을 받고, 3: 출금을 하고, 4: 잔고를 출력, 5: 종료
		switch(menu) {
		case 1: {
			int num1 = 10;
			System.out.println("통장을 개설");
			break;  // 실행문을 벗어나서 29라인으로 이동
			        // break 문이 없으면 case 2도 실행이 되므로 주의를 한다.
		}
		case 2:
			int num1;    // 오류 발생 -> case 1에 같은 변수가 이미 선언되어 있으므로
			             // 괄호있으면 사용 가능
			System.out.println("입금");
			break;
		case 3:
			System.out.println("출금");
			break;
		case 4:
			break;
		case 5: 
			break;
		default:
			break;
			
		}

	}

}
