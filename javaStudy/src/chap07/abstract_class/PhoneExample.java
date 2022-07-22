package chap07.abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("홍길동");
		sp.turn();
		sp.internetSearch();
		sp.turnoff();
		
		KtDmbPhone kt = new KtDmbPhone("이선희");
		kt.setVolume(10);

	}

}
