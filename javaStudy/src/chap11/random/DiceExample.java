package chap11.random;

import java.util.Random;

public class DiceExample {

	public static void main(String[] args) {
		// 주사위 던지기 : 1~6까지 난수 발생
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;	// 1~6까지
		System.out.println(dice);
	}

}
