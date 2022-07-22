package chap15.list_collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List : 배열과 유사
 * 구현 객체 : ArrayList(단일 스레드 환경), LinkedList, Vector(다중 스레드 환경)
 * - ArrayList : 인덱스 검색이나 맨 마지막에 객체를 추가할 때 많이 사용 (일반적으로 많이 사용)
 * - LinkedList : 중간에 데이터를 추가하거나 삭제하는 작업이 빈번할때 사용
 *  + 이전과 이후 객체 대한 참조변수가 있어서 데이터를 추가하거나 삭제할 때 빠르게 할 수 있음
 * 
 */ 

public class ArrayListExample {

	public static void main(String[] args) {
		// 왼쪽항 : 인터페이스
		// 오른쪽 항 : 구현 객체
		List<String> list = new ArrayList<>();
		list.add("홍길동"); 	// 맨 뒤에 추가된다.
		list.add("서경섭");
		list.add("권승환");
		list.add("강동현");
		list.add(0, "서한성");	// 맨 앞에 추가 : index = 0
		// 꺼낼 때 : get(index)
		String name = list.get(0);
		for(int i =0;i < list.size();i++) {		// 반복문을 사용해서 전체를 출력
			System.out.println(list.get(i));
		}
		// enhanced for문을 사용
		for(String name2 : list) {
			System.out.println(name2);
		}
		// clear() : 모든 객체를 삭제
		list.clear();
		System.out.println("크기 : " + list.size());
		if(list.isEmpty()) {
			System.out.println("비어 있습니다.");
		} else {
			
		}

	}

}
