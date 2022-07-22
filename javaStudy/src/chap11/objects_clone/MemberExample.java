package chap11.objects_clone;

public class MemberExample {

	public static void main(String[] args) {
		// 원복 개체 생성
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		// Member 객체를 복제
		Member cloned = original.getMember();
		// 복제된 객체의 비밀번호를 변경
		cloned.password = "67890";
		
		System.out.println("[복제객체의필드값]");
		System.out.println("id:"+cloned.id);
		System.out.println("name:"+cloned.name);
		System.out.println("password:"+cloned.password);
		System.out.println("age:"+cloned.age);
		System.out.println("adult:"+cloned.adult);
		
		System.out.println();
		System.out.println("[원본객체의필드값]");
		System.out.println("id:"+original.id);
		System.out.println("name:"+original.name);
		System.out.println("password:"+original.password);
		System.out.println("age:"+original.age);
		System.out.println("adult:"+original.adult);

	
	}

}
