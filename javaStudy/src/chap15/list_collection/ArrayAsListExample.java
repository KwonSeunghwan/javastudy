package chap15.list_collection;

import java.util.Arrays;
import java.util.List;

/*
 * 고정된 크기의 ArrayList를 만들 때
 * Array.asList() 메소드를 사용한다.
 */

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name : list1) {
			System.out.println(name);
		}
//		list1.add("자바");	// 고정된 크기를 가지므로 추가를 할 수 없다.
		System.out.println(list1.size());
	}

}
