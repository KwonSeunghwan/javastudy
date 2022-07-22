package chap11.system;

import java.util.Map;
import java.util.Set;

public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome=System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME]"+javaHome);
		
		// (키와 값의 쌍으로 저장)
		// 전체 환경변수를 저장
		Map<String, String>env=(Map<String, String>)System.getenv();
		Set keys = env.keySet();
		for(Object objKey:keys){
		String key = (String)objKey;
		String value = System.getenv(key);
		System.out.println("["+key+"]"+value);
		}
	}
}
