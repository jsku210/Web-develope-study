

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");//데이터를쓰고자하는 파일의 디렉토리를 설정하여 해당파이르이 객체 생성
		byte[] data = "ABC".getBytes();
//		for(int i=0; i<data.length; i++) {
//			os.write(data[i]);
//		}
		os.write(data); // for문없이 데이터를 출력할수있다
		os.flush();
		os.close();
	}

}
