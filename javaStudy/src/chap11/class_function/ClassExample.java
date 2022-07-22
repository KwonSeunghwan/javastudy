package chap11.class_function;

public class ClassExample {

	public static void main(String[] args) {
		// 클래스 정보를 얻는 방법
		// 방법 1 : 객체를 생성하고 getClass() 메소드를  사용
		Car car = new Car();
		Class clazz1=car.getClass();	// 클래스 정보를 가져온다.
		System.out.println(clazz1.getName());	// 패키지 경로부터 클래스 이름까지
		System.out.println(clazz1.getSimpleName());	// 클래스 이름만
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		try{
			// 방법 2. Class.forName(클레스 이름) ; 객체의 생성없이
			// 패키지 경로를 맞추어 준다.
			Class clazz2=Class.forName("chap11.class_function");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		}catch(ClassNotFoundException e){
		e.printStackTrace();
		}
	}
}
class Car {
	public void rolling() {
		System.out.println("차가 굴러갑니다.");
	}
}


