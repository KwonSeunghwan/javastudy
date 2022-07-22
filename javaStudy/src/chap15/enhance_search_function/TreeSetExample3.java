package chap15.enhance_search_function;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		System.out.println("[c~f 사이의 단어 검색]");	// f는 검색이 안됨
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);

		for (String word : rangeSet)
			System.out.println(word);
		
		System.out.println("------------------------------");
		System.out.println("[c보다 낮은 단어 검색]");	// 가나다순으로 이전에 있는 단어
		NavigableSet<String> headSet = treeSet.headSet("cherry", true);	// cherry는 포함이 됨

		for (String word : headSet)
			System.out.println(word);
	}
}