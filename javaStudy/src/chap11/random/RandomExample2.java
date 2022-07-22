package chap11.random;

import java.util.Random;

public class RandomExample2 {

	public static void main(String[] args) {
		// 10~20까지의 난수를 발생
		Random rand = new Random();
		int value = rand.nextInt(11) + 10;	// 0~10
		System.out.println(value);

	}

}
