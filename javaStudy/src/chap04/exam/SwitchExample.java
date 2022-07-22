package chap04.exam;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		/*
		 	 조건문 : Switch문
		 */
		boolean game = true; // 게임을 유지하기 위한 선언
		int money[] = new int[10]; // 입출금 계좌 배열
		String acountNumber[] = new String[10]; //계좌 번호 계좌 배열
		Scanner scan = new Scanner(System.in); // 사용자로 부터 키보드 입력을 받기 위한 입력문
		while(game) {
		System.out.println("===================================================================");
		System.out.println("1: 통장 개설, 2: 입금, 3: 출금, 4.통장 조회  5. 잔고 출력, 6. 종료"); 
		System.out.println("===================================================================");
		int menu = scan.nextInt();	 // 키보드로부터 입력을 받는다.
		
		switch(menu) {
		case 1:
		System.out.println("통장을 개설하시겠습니까?, y, n");
		String check = scan.next();
		if("y".equals(check) || "Y".equals(check)) {
			System.out.println("원하는 통장 번호 12자리를 - 를 포함하여 입력해주세요");
			String number = scan.next();
			Integer nullIndex = null; //배열의 비어있는 index 중 첫번째 index를 찾기 위한 변수

			for (int i = 0 ; i < 10 ; i++ ) {
	            /* if (acountNumber[i] == null nullIndex == null) {
	                nullIndex = i; */
	            if (acountNumber[i] == null) {
	                if (nullIndex == null)
	                    nullIndex = i;
	            } else if(acountNumber[i].equals(number)) {
	                System.out.println("이미 사용중인 통장 번호이거나 모든 통장 갯수를 사용 중입니다.\n 통장 갯수를 확인 하시거나 새로운 통장 번호를 입력해 주십시오.");
	                break;
	            }
	        }
	        
	        if (nullIndex != null) {
	            acountNumber[nullIndex] = number; //배열의 공간 중 비어있는 가장 첫번째 공간에 계좌 저장
	            // money[nullIndex] = 0;
	            System.out.println(nullIndex + "번 째 통장 개설 하셨습니다. 앞으로 많은 이용 부탁드립니다.");  
	            break;
	        }
		} else if("n".equals(check) || "N".equals(check)) {
			System.out.println("통장 개설을 취소하셨습니다. 프로그램을 종료합니다.");
			break;
		} else {
			System.out.println("잘못 입력하셨습니다. 보안상 프로그램을 종료합니다.");
			break;
		}
		case 2:
		System.out.println("어디 계좌에 입금 하시겠습니까?");
		int select = scan.nextInt();
		System.out.println("선택하신 " + acountNumber[select] + " 계좌에 얼마를 입금하시겠습니까?");
		int dol = scan.nextInt();
		money[select] = money[select]+ dol;
		System.out.println(acountNumber[select] + "계좌에 " + dol + "원 이 입금되어 " + money[select] +"원이 남았습니다.");
		break;
		
		case 3:
		System.out.println("어디 계좌에서 출금 하시겠습니까?");
		int select2 = scan.nextInt();
		System.out.println("선택하신 " + acountNumber[select2] + " 계좌에서 얼마를 출금하시겠습니까?");
		int dol2 = scan.nextInt();
		money[select2] = money[select2]- dol2;
		if (money[select2] <=0) {
			System.out.println("계좌의 잔액이 부족합니다.");
			money[select2] = money[select2]+ dol2;
			break;
		}
		System.out.println(acountNumber[select2] + "계좌에 " + dol2 + "원 이 출금되어 " + money[select2] +"원이 남았습니다.");
		break;
		
		case 4:
		System.out.println("현재 저희 은행의 모든 통장 계좌입니다.");
		for (int i = 0 ; 
				i < 10 ; i++ ) {
			System.out.println(acountNumber[i]);
		}
		break;
		
		case 5:
		System.out.println("원하시는 통장을 선택해 주십시오.");
		
		int select3 = scan.nextInt();
		System.out.println("선택하신 " + acountNumber[select3] + " 계좌의 남은 잔액은 " + money[select3] + "원 입니다.");
		break;
		
		
		case 6:
		System.out.println("프로그램을 종료합니다.");
		game=false;
		
		default:
		break; 
	}
		}

}
}