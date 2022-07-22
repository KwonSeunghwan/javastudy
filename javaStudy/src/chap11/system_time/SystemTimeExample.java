package chap11.system_time;

/* 시스템에서 제공하는 시간을 얻는 방법
 * System.currentTimeMillis() : ms 단위로 시스템의 현재시간을 반환. 1990년 1월 1일이 0이다.
 * System.nanoTime() : ns 단위 (E-9) -> method의 수행시간을 측정하는데 사용 (종료시간 - 시작시간)
 */
public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();	// 시작 시간을 저장
//      long time3 = System.currentTimeMillis();
		int sum=0;
		for(int i=1; i<=1000000; i++){
		sum += i;
		}
		long time2=System.nanoTime();	// 종료 시간
// 		long time4=System.currentTimeMillis();
		System.out.println("1~1000000까지의합 : " + sum);
		System.out.println("계산에 " + (time2 - time1)+ " 나노초가 소요되었습니다.");
// 		System.out.println("계산에 " + (time4 - time3)+ " ms가 소요되었습니다.");

	}

}
