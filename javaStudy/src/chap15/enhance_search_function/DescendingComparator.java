package chap15.enhance_search_function;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {
	
	// 비교방법을 정한다 : 이름순으로, 가격순으로, 가격이 같을 경우 이름순으로
	// 여기서는 가격의 내림차순으로 정렬 : compare(o2, o1) -> o2 - o1 > 0
	// 오름차순 : compare(o1, o2) -> o1 - o2 < 0
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return Integer.compare(o2.price, o1.price);
	}

}
