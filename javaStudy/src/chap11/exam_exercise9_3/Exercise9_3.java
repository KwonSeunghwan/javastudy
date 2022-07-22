package chap11.exam_exercise9_3;

public class Exercise9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		
		path = fullPath.substring(0,fullPath.lastIndexOf("\\"));	// lastIndexOf
		fileName = fullPath.substring(fullPath.lastIndexOf("\\")+1);
		
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);

	}

}
