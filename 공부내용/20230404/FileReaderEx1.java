package src;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");//문자열을 전송할때 쓰는클래스로 FileInPutStream객체로 생성시 문자열을 출력할때 깨지지만 FileReader로 생성시 깨지지않는다
		int readData;//read()의 반환값이 int이기때문에 int 변수 선언
		while( true ) {// 객체 reader를 끝까지 읽어오기위해 while문 
			readData = reader.read();//readData에 값을 한글자씩 불러와 int에 저장한다
			System.out.print(readData);//읽어온 값이
			if(readData == -1) break;//읽어온 readData의 값이 0,1이라면 
			System.out.print((char)readData);//읽어온값int를  char형으로변환시켜 write시켜준다 
		}
		
		reader.close();
	
		Reader r = new FileReader("C:/Temp/test.txt");
		int a;
		
		while(true) {
	
			a = r.read();
//			System.out.print(a);
			if(a==-1)break;//r.read()는 하나씩 값을가져오는데 한번가져오면 처음값을 가져오지못하기때문 변수 a에서 가져와야한다
			
			System.out.print((char)a);
			
		}
		r.close();
		
		
	}

}
