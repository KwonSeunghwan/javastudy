package chap06.exam.exercise6_24;

public class Exercise6_24 {

	/*
	 * (1) abs메서드를 작성하시오
	 */

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 :" + abs(value)); // 5
		value = -10;
		System.out.println(value + "의 절대값 :" + abs(value)); // 10

	}

	public static int abs(int value) {
		if (value >= 0) {
			return value;
		} else {
			return -value;
		}

	}
}
