package chap05;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 배열의 단점 : 고정된 크기를 가진다.
		int cart[] = { 10, 20, 30 };		// length 3인 배열
		
		// 더 많은 데이터를 저장하고 싶다.
		int[] newCart = new int[6];		// 더 큰 배열을 생성
		// 기존의 데이터를 옮겨서 담아야 한다.
		// 반복문을 사용
		for(int i = 0;i < cart.length;i++) {
			newCart[i] = cart[i];
		}
		
		// System.arrayCopy() 메소드를 사용
		// System.arrayCopy(Object src, int srcIndex, Object dest, int destIndex, int size);
		System.arraycopy(cart, 0, newCart, 0, cart.length);	// 반환형이 없음
		
		// Arrays.copyOf() 메소드를 이용
		int[] newArr = Arrays.copyOf(cart, 6);	// 반환값 : 생성된 배열의 주소
		for(int i = 0;i < newArr.length;i++) {	// 복사가 안된 곳은 0으로 초기화가 된다.
			System.out.println(newArr[i]);
		}
	}

}
