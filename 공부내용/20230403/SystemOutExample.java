

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;	//OutputStream을 System클래스의 out메소드를 통해 객체를 생성할수있다	
		
		for(byte b=34; b<96; b++) { 
			os.write(b);//해당 바이트값을 객체 os의 write메소드를 통해 해당값의 문자를 프린트시켜준다
		}		
		os.write(10);
		
		for(byte b=97; b<123; b++) {
			os.write(b);
		}		
		os.write(10);		

		String hangul = "한글입니다";
		byte[] hangulBytes = hangul.getBytes();//hangul을 바이트값으로 변환시킨뒤 해당 배열에 값을 저장시킨다
		os.write(hangulBytes);
		System.out.println(hangul.getBytes());//해당 바이트값을 출력시켜준다
		
		os.flush();//현재 버퍼에있는 데이터를 완전하게출력하는것 보장하여 출력한뒤 버퍼를비워 새로운 출력데이터를 받을준비한다
	}
}

