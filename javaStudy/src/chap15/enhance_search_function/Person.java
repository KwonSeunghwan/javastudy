package chap15.enhance_search_function;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// age 순으로 정렬 : 무엇으로 정렬을 해야할지를 결정해야 한다. -> 나이순으로
	@Override
	public int compareTo(Person o) {
		return Integer.compare(age, o.age);
	}

}
