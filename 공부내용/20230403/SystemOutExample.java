

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;	//OutputStream�� SystemŬ������ out�޼ҵ带 ���� ��ü�� �����Ҽ��ִ�	
		
		for(byte b=34; b<96; b++) { 
			os.write(b);//�ش� ����Ʈ���� ��ü os�� write�޼ҵ带 ���� �ش簪�� ���ڸ� ����Ʈ�����ش�
		}		
		os.write(10);
		
		for(byte b=97; b<123; b++) {
			os.write(b);
		}		
		os.write(10);		

		String hangul = "�ѱ��Դϴ�";
		byte[] hangulBytes = hangul.getBytes();//hangul�� ����Ʈ������ ��ȯ��Ų�� �ش� �迭�� ���� �����Ų��
		os.write(hangulBytes);
		System.out.println(hangul.getBytes());//�ش� ����Ʈ���� ��½����ش�
		
		os.flush();//���� ���ۿ��ִ� �����͸� �����ϰ�����ϴ°� �����Ͽ� ����ѵ� ���۸���� ���ο� ��µ����͸� �����غ��Ѵ�
	}
}

