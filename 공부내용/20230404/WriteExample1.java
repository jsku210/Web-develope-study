package src;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt", true);//boolean을 true로설정해주면 덮어써준다 기본값 faulse로 초기화시키고 저장한다
		Scanner s = new Scanner(System.in);
		System.out.println("저장할 내용을 입력하세요");
		String ss = s.nextLine();
		char[] data = ss.toCharArray();
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
			// FileWriter의 write는 char[]이 들어간다 write메소드 자체에 for문이 들어가있어 자동으로 저장해준다
		}
		writer.flush();
		writer.close();
	}

}
