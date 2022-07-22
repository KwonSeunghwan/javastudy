package chap04;

public class IfExample {

	public static void main(String[] args) {
		// 
		int age = 20;               // 나이
		boolean gender = true;      // 성별을 입력 받고, true:남자, false:여자
		String candidate = "윤석열"; // 지지자를 입력을 받았을 때 (이재명, 심상정)
		//연령별, 성별, 지지하는 후보
		int arr[] = new int[3];    // 계수
		if(age >= 18 && age <20)  {  //10대
			// 조건을 만족하면 실행이 된다
			if(gender == true) {        //중첩문 : if문 안에 if문이 있을 경우  남성
				if(candidate.equals("윤석열")) { // if문의 중첩 횟수는 제한이 없음
					arr[2]++;
				} else if(candidate.equals("이재명")) {
					arr[1]++;
				} else {
					arr[3]++;
				}
			} else {                    //여성
				
			}
		} else if(age >= 20 && age < 30) {  //20대 - 선택사항(존재할 수도 있고, 없을 수도 있다.)
			
		} else if(age >= 30 && age < 40) {  //30대 - 비교 조건이 여러개 있으면 여러 개를 사용
			
		} else if(age >= 40 && age < 50) {  //40대
			
		} else if(age >= 50 && age < 60) {  //50대
			
		} else if(age >= 60 && age < 70) {  //60대
			
		} else {    // 그밖에 70이상  - 선택사항

		}

		// if문의 조건을 만족해서  실행을 한 후 이곳으로 프로그램의 순서가 이동된다.
		// 이렇게 사용할 수도 있지만, 약간 효율이 떨어진다. -> 매번 판단을 해야 하므로
		if(age >= 18 && age < 20) {
			
		}
		if(age >= 20 && age < 30) { // 10대인 경우 불필요하게 또 비교를 하게되어 효율이 떨어진다.
			
		}
		if(age >= 30 && age < 40) {
			
		}
		
		// 실행문이 한 줄일 경우 중괄호는 생략할 수 있다. -> 그런데 일반적으로 중괄호를 사용하는 것이 좋다.
		if(gender) {
			 // gender가 true이면 실행된다.
			System.out.println("남성");  // 실행문이 한 줄 이었는데 한줄을 추가하고 싶을 때
			                            // 이때 중괄호를 추가해야 하는데 잊을 수가 있다.
		    System.out.println("한 줄 더 추가");
		}
		else   // 한 줄이라도 중괄호를 사용하는 것이 좋다.
			System.out.println("여성");
		
	}

}
