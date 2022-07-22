package chap15.list_collection;

import java.util.List;
import java.util.Vector;

/*
 * Vector : List의 구현 객체 중의 하나이고, 동기화를 지원 (다중 스레드 환경에서 사용)
 * ArrayList : 단일 스레드 환경에서 사용
 * 사용방법은 ArratList와 동일
 */

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("7월19일 입니다.", "즐거운 날 입니다.", "홍길동"));
		list.add(new Board("자바 컬렉션", "ArrayList를 배웠습니다.", "김해주"));
		list.add(0, new Board("다음 주 배울 과목", "데이터베이스", "서경섭")); 	// 맨 앞에 추가
		list.remove(0);
		// 출력
		for(Board board : list) {
			System.out.println(board);
		}

	}

}
