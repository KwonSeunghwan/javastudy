package chap05.exam;

public class Exercise5_4 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20, 20, 20 }, 
				{ 30, 30, 30, 30, 30 } 
				
		};
		
		int total = 0;
		float average = 0;
		int count = 0;	// 전체 갯수
		
		/*
		 * (1) . 알맞은 코드를 넣어 완성하시오
		 */
		
		// 열의 수만큼 반복 -> 반복문 1개
		// 하나의 열에서 행의 수만큼 반복 -> 반복문 1개
		for(int i = 0;i <arr.length;i++) { // 열의 수만큼 반복
			// 0열, 1열, 2열, 3열
			// 열내에서 행의 수만큼 반복
			// arr[i][j]
			// 0열 : [0][0], [0][1], [0][2], [0][3], [0][4]
			// 1열 : [1][0], [1][1], [1][2], [1][3], [1][4]
			// 2열 : [2][0], [2][1], [2][2], [2][3], [2][4]
			// 3열 : [3][0], [3][1], [3][2], [3][3], [3][4]
			count += arr[i].length;	// 각 열의 행의 수를 더한다.
			for(int j = 0;j < arr[i].length;j++) {
				//System.out.println(i + "," + j );
				total += arr[i][j];
				
			}
		}
		
		average = (float)total / count;
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
		
	} // end of main
} // end of class
