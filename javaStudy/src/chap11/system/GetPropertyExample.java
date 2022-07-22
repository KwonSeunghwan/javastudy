package chap11.system;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// getProperty() 메소드를 이용해서 환경변수를 읽어 올 수 있다.
		// 애플리케이션이 수행하는 컴퓨터의 환경변수를 읽어서 활용한다.
		/*  Window OS : 파일 경로 C:\Temp
		 *  Linux OS : 파일 경로 /tmp
		 *  OS에 따라서 파일 경로의 체계가 다르므로 내가 어느 OS 컴퓨터에서 실행되는지 알아야 하고
		 *  그 때 이 메소드를 사용하여 OS를 알 수 있다.
		 * 
		 */
			String osName=System.getProperty("os.name");
			String userName=System.getProperty("user.name");
			String userHome=System.getProperty("user.home");
			System.out.println("운영체제이름:"+osName);
			System.out.println("사용자이름:"+userName);
			System.out.println("사용자홈디렉토리:"+userHome);
			System.setProperty("java.runtime.version","JavaRuntime1.6.0");
			System.out.println("---------------------------------");
			System.out.println("[key]value");
			System.out.println("---------------------------------");
			// 키값을 모르고 모든 property 값을 가져오는 방법
			Properties props=System.getProperties();
			Set keys=props.keySet();
			for(Object objKey:keys){
			String key=(String)objKey;
			String value=System.getProperty(key);
			System.out.println("["+key+"]"+value);
		}
	}
}
