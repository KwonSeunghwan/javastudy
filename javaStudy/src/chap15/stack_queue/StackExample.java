package chap15.stack_queue;

import java.util.Stack;

/*
 * 스택(Stack) :
 * LIFO : 후입선출
 * 사용 예 : Java 프로그램 실행 시, 메소드에서 사용되는 변수를 저장할 때
 * - push : 데이터를 스택에 넣을 때
 * - push : last에 있는 데이터를 제거하지 않고 값을 얻을 때 사용한다.
 * - pop : last에 있는 데이터를 제거하고 값을 얻을 때
 */

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		while (!coinBox.isEmpty()) {	// 10, 500, 50, 100
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}