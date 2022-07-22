package chap07.field.polymorphism;

public class NexenTire extends Tire {
	
	// 필드
		// 생성자
		public NexenTire(String location, int maxRotation) {
			super(location, maxRotation);
		}

		// 매소드
		@Override	// 타이어 회사별로 자신의 공법에 따라서 제조(재정의)를 한다.
		public boolean roll() {
			++accumulatedRotation;
			if (accumulatedRotation < maxRotation) {
				System.out.println(location + "NexenTireTire 수명:" + (maxRotation - accumulatedRotation) + "회");
				return true;
			} else {
				System.out.println("***" + location + "NexenTireTire펑크***");
				return false;
			}
		}
	}



