package chap15.enhance_search_function;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		/*
		// Fruit이 Comparable interface를 구현하지 않았고, 비교자(Comparator)를 제공하지 않음
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		// Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
		treeSet.add(new Fruit("포도", 3000));		// 비교할 방법이 제공되지 않음 -> 예외
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		*/
				
		// Set에 넣을 Fruit 객체가 Comparable interface를 구현하지 않은 경우
		// TreeSet 객체를 생성하면서 비교 방법인 DescendingComparator() 객체를 넣어줌		
		 TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		 treeSet.add(new Fruit("포도", 3000)); 
		 treeSet.add(new Fruit("수박", 10000));
		 treeSet.add(new Fruit("딸기", 6000));
		 
		Iterator<Fruit> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}