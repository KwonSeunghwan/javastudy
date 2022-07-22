package chap11.objects_compare;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		// compare(객체1, 객체2, 비교방법)
		// 비교 방법 : interface Comparator를 구현한 객체
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);	// 0 : 같다
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);	//	-1 : 1-2(s1.sno - s3.sno) 다르다

	}
	
	static class Student {
		int sno;	// 학번
		
		Student(int sno) {
			this.sno = sno;
		}
	}

	static class StudentComparator implements Comparator<Student> {
		
	
		// Comparator 인터페이스의 추상 메소드를 재정의 : 두 객체를 비교하는 방법
		@Override
		public int compare(Student o1, Student o2) {
			// 학번이 같으면 같은 학생
			return Integer.compare(o1.sno, o2.sno);	// o1.sno - o2.sno
		}
	}
}
