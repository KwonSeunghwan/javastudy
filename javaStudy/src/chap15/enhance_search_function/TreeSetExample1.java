package chap15.enhance_search_function;

import java.util.TreeSet;

/*
 * 검색 기능을 강화한 컬렉션 : TreeSet, TreeMap -> binary tree 형태로 저장이 된다.
 * 어떤 데이터를 넣을 때, 자동으로 정렬이 된다. -> 오름차순으로
 */

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));	// 75, 80, 87, 95, 98
		
		Integer score = null;
		
		score = scores.first();	// 현재 트리 구조를 유지한채 값만 가져온다.
		System.out.println("가장 낮은 점수: " + score);	// 75
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");	// 98
		
		score = scores.lower(new Integer(95));	// 87
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95));	// 98
		System.out.println("95점 위의 점수: " + score + "\n");
		
		score = scores.floor(new Integer(95));	// 95
		System.out.println("95점 이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(85));	// 87
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");
		
		while (!scores.isEmpty()) {
			score = scores.pollFirst();	// 가장 낮은 값을 삭제하고 가져온다.
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
	}
}