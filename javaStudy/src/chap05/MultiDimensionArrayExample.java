package chap05;

public class MultiDimensionArrayExample {

	public static void main(String[] args) {
		// 이차원배열
		int[][] scores = new int[3][4];		// 3 * 4
		int scores2[][] = new int[4][5];	// 4 * 5
		for(int i = 0;i < scores.length;i++) {	// i : 열, 길이 scores.length
			for(int j = 0;j < scores[i].length;j++) {	// j : 행, 길이 : scores[i].length
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}

		int scores3[][] = { { 1, 2, 3}, {4, 5, 6, 7} };		// 배열안에 배열이 중첩되어 있음
		// {} : 배열
		// JSON : [] : 배열
		//		  {} : 객체
		for(int i = 0;1 < scores3.length;i++) {
			for(int j = 0;j < scores3[i].length;j++) {
				System.out.print(scores3[i][j] + " "); 
			}
			System.out.println();
		}
		// 별개로 생성
		int scores4[][] = new int[2][];	// 열을 생성
		scores4[0] = new int[5];	// 열 0의 배열을 생성 -> 길이가 5
		scores4[1] = new int[3]; 	// 열 1의 배열을 생성
		
		String[] strArray = new String[4];
		System.out.println("--------------------------");
		for(int i = 0;1 < strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		strArray[0] = new String("홍길동");	// 문자열 객체를 생성
		strArray[1] = "JAVA";
		strArray[2] = "데이터베이스";
		strArray[3] = "HTML";
		// 객체를 생성하지 않고 
		for(int i = 0;1 < strArray.length;i++) {
			System.out.println(strArray[i]);
	}

}
}
