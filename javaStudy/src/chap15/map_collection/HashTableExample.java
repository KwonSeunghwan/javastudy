package chap15.map_collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
 * HashTable : Map의 일종으로 HashMap과 기능(사용방법)은 동일
 * 차이점 : HashTable -> 동기화를 지원(멀티 스레드 환경에서 사용)
 */
public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디: ");
			String id = scanner.nextLine();
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if (map.containsKey(id)) {	// 회원가입이 되어 있는 아이디
				if (map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}