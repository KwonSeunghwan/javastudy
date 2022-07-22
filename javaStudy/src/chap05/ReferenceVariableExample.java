package chap05;

public class ReferenceVariableExample {

	public static void main(String[] args) {
		int age = 20;
		double price = 10.5;
		String name = "홍길동";
		String hobby = "독서";
				
		printPrimitiveVariable(age, price);
		System.out.println("이름: " + name);
		System.out.println("취미: " + hobby);

	}

	private static void printPrimitiveVariable(int age, double price) {
		System.out.println("나이: " + age);
		System.out.println("가격: " + price);
		
	}

}
