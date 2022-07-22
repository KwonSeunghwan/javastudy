package chap15.enhance_search_function;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		
		for (Integer score : descendingSet)	// 정렬된 순서를 제공
			System.out.print(score + " ");
		System.out.println();
		
		// 한번 더 실행하면 오름차순으로 정렬된다.
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for (Integer score : ascendingSet)
			System.out.print(score + " ");
	}
}