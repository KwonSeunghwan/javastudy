package chap11.exam_exercise9_4;

public class Exercise9_4 {

	static void printGraph(int[] dataArr, char ch) {
		/*
		(1) printGraph메서드를 작성하시오
		*/
		
		for(int i=0; i< dataArr.length;i++) {	// 배열의 수만큼 반복
			for(int j=0; j<dataArr[i];j++) { 	// 별의 수
				System.out.print("*");
			}
			System.out.println(dataArr[i]);
		}
		}
		public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4},'*');

	}

}


/*
***3
*******7
*1
****4
*/