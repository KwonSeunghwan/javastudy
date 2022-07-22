package chap07.inherit_introduction;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "111111 - 2222222", 1);
		System.out.println("이름= " + student.name);
		System.out.println("주민등록번호= " + student.ssn);
		System.out.println("학번= " + student.studentNo);

	}

}
