package chap11.objects_hash;

	import java.util.Objects;

	public class NullExample {
		public static void main(String[] args) {		
			String str1 = "홍길동";
			String str2 = null;
			
			System.out.println(Objects.requireNonNull(str1));	// str1
			
			try {
				String name = Objects.requireNonNull(str2);		// nill일 경우 예외
			} catch(Exception e) {
				System.out.println(e.getMessage());	// e.getMessage() : null
			}
			
			try {
				String name = Objects.requireNonNull(str2, "이름이 없습니다.");
			} catch(Exception e) {
				System.out.println(e.getMessage());	// e.getMessage() : "이름이 없습니다."
			}
			
			// 기존 교안에 있는 실습파일은 MSM949로 인코딩이 되어 있으므로
			// UTF-8로 인코딩을 하는 이클립스 환경에서는 깨진 글자처럼 보인다.
			// 해결방법 : MSM949 -> UTF-8로 변경해주면 된다.
			
			try {
				// 람다식으로 작성
				String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요");
			} catch(Exception e) {
				System.out.println(e.getMessage()); // e.fetMessage() : "이름이 없다니깐요"
			}
		}
	}


