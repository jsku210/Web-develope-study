import java.io.IOException;
import java.io.InputStream;

public class SystemOutExample2 {

	public static void main(String[] args) throws IOException { // InPutStream을 사용하면 IOException이 발생할수있음을나타냄
		// TODO Auto-generated method stub
		System.out.println("이름 : ");
		byte[] bm = new byte[100];
		InputStream is = System.in;
		int name = is.read(bm); //콘솔창에 입력한값을 바이트로 변환시켜 배열의크기를 저장해준다
		String name1 = new String(bm,0,name-2); // 입력한 값이 바이트의 길이에 해당되는 값이 출력된다
		System.out.println("하고싶은말 : ");//배열의 인덱스가 0부터 시작하고 엔터토 하나의 바이트값으로 입력되어 -2하여야 입력한값만 저장된다
		int want =  is.read(bm);
		String want1 = new String(bm,0,want-2);
		System.out.println("입력한 이름은 : " + name1);
		System.out.println("입력한 하고싶은말은 : " + want1);
	}

}
