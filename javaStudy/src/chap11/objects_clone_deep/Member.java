package chap11.objects_clone_deep;

import java.util.Arrays;

public class Member implements Cloneable {
	// 필드 : 참조변수와 배열 -> 깊은 복제를 하려고
	public String name;
	public int age;
	public int[] scores;	// 배열
	public Car car;			// 객체
	
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// 깊은 복제를 하려면 clone() 메소드를 재정의 해야한다.
	// Object 클래스의 clone() 메소드가 동작 -> 얕은 복제를 한다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone(); -> 얕은 복제
		// 깊은 복제를 위해서 재정의
		// 배열을 생성. Car객체를 생성. 참조변수의 주소를 변경(배열, car)
		Member cloend = (Member)super.clone();	// 얕은 복제한 Member 객체
		cloned.scores = Arrays.copyOf(scores, scores.length);
		// Car 객체를 생성하고 참조변수 car를 변경
		cloned.car = new Car(car.model);
		return cloned;
	}
	
	// 복제된 Member 객체를 얻는 메소드를 추가
	public Member getMember() {
		Member cloned=null;
		try{
		cloned=(Member)clone();
		} catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return cloned;

	}
	

}
