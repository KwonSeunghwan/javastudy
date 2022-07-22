package chap11.objects_clone;

// 객체를 복제하려면 Cloneable 인터페이스를 구현해야 한다.
// Cloneable 인터페이스를 구현하지 않으면 CloneNotSupportedException
public class Member  /*implements Cloneable */{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	// 생성자
	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	// 복제된 Member 객체를 얻는 메소드를 추가
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();	// clone() 메소드는 Object 객체를 반환하므로 Member 객체로 형변환
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
