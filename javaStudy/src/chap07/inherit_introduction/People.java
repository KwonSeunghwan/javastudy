package chap07.inherit_introduction;

public class People {
	public String name;		// 이름
	public String ssn;	// 주민등록번호
		
		// 생성자 : 매개변수가 있는 생성자 -> default 생성자를 만들지 않음 -> default 생성자가 없음
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		}

}
