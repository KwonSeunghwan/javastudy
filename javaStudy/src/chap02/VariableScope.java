package chap02;

public class VariableScope {
	int var0;    //필드

	public static void main(String[] args) {
		/*
		 * 변수의 사용 범위
		 * 블럭(블럭의 시작을 나타내는 '{'과 블럭의 끝을 나타내는 '}'로 구성)내에서 사용
		 * - 클래스 블럭
		 * - 메소드 블럭
		 * - 정적 블럭
		 * - if(조건문)문 또는 for(반복문)문에 대한 블럭
		 * 
		 * 블럭내에서만 존재한다.
		 * 블럭을 벗어날 경우는 사용할 수 없음.
		 */
		// var1 : main 메소드 안에서 선언됨 -> main 메소드 안에서는 어디서든지(뒤에서) 사용 가능
		int var1 = 10;
		if(true) {  // if문 블럭
			int var2 = 40;
			var2 += var1;    // main 메소드 안이므로 var1을 사용 가능
		}
		for(int i = 0;i < 10;i++) {
			int var3 = 20;
			int var4 = var1 + var2;    // var1은 main 메소드 안에 있는 for문 안이므로 사용 가능
			// var2는 if안에서 선언이 되었으므로 if문을 벗어나면 사용할 수 없음
			// if문을 벗어나면 스택에서 삭제가 된다.
		}

		int var5 = var1 + var3;  // var3은 for문 안에서만 사용 가능
		// var0는 사용할 수 없음 -> 나중에 배운다. (static 메소드내에서는 사용 불가)
	}
	public void method2() {     // method2는 클래스안에 있음
		int var6 = var0 + 30;   // class 범위내에서 사용 가능하므로 사용할 수 있음
	}

}
