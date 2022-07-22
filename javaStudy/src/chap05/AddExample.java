package chap05;

public class AddExample {

	public static void main(String[] args) {
		// AddExample 프로그램을 실행할 때 파라미터로 데이터를 입력받을 수 있다. -> String[] args ->
		// cmd창에서 java AddExample 10 20 -> 더한 결과를 출력하는 프로그램
		// cmd창으로 부터 더할 두개의 수를 입력받을 수 있음
		if(args.length != 2) {
			System.out.println("usage: java AddExample 10 20");	// 사용법을 안내를 출력
			System.exit(1);	// 프로그램을 종료
		}
		System.out.println("args[0] = " + args[0]);
		System.out.println("args[1] = " + args[1]);
		System.out.println();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = num1 +num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}

}
