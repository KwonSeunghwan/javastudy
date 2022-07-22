package chap11.random;

import java.util.Random;

// 난수 발생 : Math.random() : 0.0 <= x(double) < 1
/* Random 클래스  : seed를 사용 가능
 * Random rand = new Random();
 * 
 */
public class RandomExample {

	public static void main(String[] args) {
		// 난수를 발생시키기 위해서 seed를 제공할 수 있는데 
		// 같은 seed 값을 사용하면 언제나 같은 난수가 발생된다. -> 예측할 수 있다.
		Random rand1 = new Random(0L);	// seed = 0L
		System.out.println(rand1.nextInt());
		// 랜덤한 난수를 발생시키기 위해서는 seed를 다른 값으로 넣어 주어야 한다.
		Random rand2 = new Random() ;	// seed = 현재시간이 사용된다.
			// 현재시간은 시간에 따라서 계속 다른 값이 나온다. 따라서 발생되는 난수가 언제나 다르다.
		System.out.println(rand2.nextInt());	// int 중에 가능한 수를 발생
	}

}
