package chap07.exam.exercise4;

public class Exercise4 {
	// action 메소드 (정적 메소드) - static 메소드인  main()에서 호출되었기 때문
	static void action(Robot r) {
		// 작성해야 하는 부분
		if(r instanceof DanceRobot) {
			((DanceRobot)r).dance();	// Robot -> DanceRobot
		} else if(r instanceof SingRobot) {
			((SingRobot)r).sing();
		} else {
			((DrawRobot)r).draw();
		}
		
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main

}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
