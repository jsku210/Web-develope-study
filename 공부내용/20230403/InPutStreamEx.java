import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InPutStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/Java/test.txt");// 파일경로 설정시 c:후 /로경로 지정
		int a;
		String data = "";// null로 설정한것과 ""로설정한것은 다름
		byte[] b = new byte[8];
		a = is.read(b, 2, 3);
		while ((a = is.read(b, 0, 3)) != -1) {// while문에들어가야 8개바이트값을 받아오고 저장한뒤 다음 바이트를 읽어온다
			data += new String(b, 0, b.length);
		}
		for (int i = 0; i < b.length; i++) {// while문없이 작성하여 8개의값만 가져왔다
			System.out.println(b[i]);

		}
		data += new String(b, 0, b.length);
		System.out.print(data);
		is.close();
	}

}
