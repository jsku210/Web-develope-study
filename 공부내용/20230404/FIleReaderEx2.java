package src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FIleReaderEx2 {
	public static void main(String[] args) throws IOException {
//		Reader reader = new FileReader("C:/Temp/test.txt");
//		int readCharNo;
//		char[] cbuf = new char[2];//char형 배열을 크기가2인 배열로 선언한다
//		String data = "";//string형의 data를 만들어 ""값을 넣어준다 여기서 null로 넣어주게되면 nullPointException이 발생됨
//		while( true ) {
//			readCharNo = reader.read(cbuf);//Reader형의 객체이기때문에 char을 넣어줄수있고 cbuf에 두개씩담아 읽어오며 readCharNo에반환되어 값이 들어있는지 확인할수있다
//			if(readCharNo == -1) break;
//			System.out.println(readCharNo);//출력해보면 값이둘다 들어있다면 2가 하나만 가지고있다면 1이 출력됨을 알수있다
//			data += new String(cbuf, 0, readCharNo);//cbuf저장된값을 0~저장된만큼 가져와 String객체를 만들어 data에 저장한다
//			System.out.println(data);
//		}
//		
//		
//		reader.close();
		Reader r = new FileReader("C:/Temp/test.txt");
		int rNo;
		char[] cc = new char[2];
		String data = "";
		while(true) {
			rNo = r.read(cc);
			if(rNo ==-1 )break;
			data += new String(cc,0,rNo);
			System.out.println(data);
		}
		System.out.println(data);
		r.close();
	}
}
