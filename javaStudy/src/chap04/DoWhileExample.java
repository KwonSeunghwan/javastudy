package chap04;

import java.util.Scanner;    // 클래스의 뒤에서 Control+space키를 누르면 이클립스가 자동으로 추가해준다.
                             // 후보가 한 개만 있을 때

public class DoWhileExample {

	public static void main(String[] args) {
		// do-whil문 : 무저간 실행문을 한번을 실행을 하고, 그 이후에 반복여부를 판단할 때 
		// 입력받은 값에 따라서 다르게 동작을 하고 싶을 때.
		// 프로그램 사용법을 출력
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		// 키보드로부터 데이터를 입력받기 위하여 Scanner 클래스를 사용
		Scanner scanner = new Scanner(System.in);
		String inputString;  // 입력받을 데이터를 저장하는 변수를 추가
		do {
			//안내문을 출력
			System.out.print("> ");
			inputString = scanner.nextLine();    // 한줄씩 입력 받음 (엔터키까지 입력)
			System.out.println(inputString);
		} while(!inputString.equals("q"));       // 세미 콜론을 붙여 준다.
        System.out.println();
        System.out.println("프로그램 종료");
	}

}
