package chap06.exam.exercise6_23;

public class Exercise6_23 {
	
	/*
	(1) max메서드를 작성하시오.
	*/
	
	static int max(int[] arr) {
		// 주어진 int형이 배열의 값 중에서 제일 큰 값을 반환한다.
		// 만일 주어진 배열이 null 이거나 크기가 0인 경우, -999999를 반환한다.
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		int maximum = Integer.MIN_VALUE;	// 초기값을 최소값으로 한다.
		
		// 최소값을 구하려면 maximum = Integer.MAX_VALUE;
		for(int i = 0;i < arr.length;i++) {
			// 새로운 최대값을 구한다.	-> 반복
			if(maximum < arr[i]) {	// 새로운 최대값
				maximum = arr[i];
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 :"+max(data)); 
		System.out.println("최대값 :"+max(null)); 
		System.out.println("최대값 :"+max(new int[]{})); // 크기가 0인 배열 : null

	}

}
