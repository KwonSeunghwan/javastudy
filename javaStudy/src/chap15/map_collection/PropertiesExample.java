package chap15.map_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		System.out.println("path: " + path);
		path = URLDecoder.decode(path, "UTF-8"); // 파일의 경로에 대한 한글 처리
		prop.load(new FileReader(path)); 	// 파일 읽어 옴
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);

		

	}

}
