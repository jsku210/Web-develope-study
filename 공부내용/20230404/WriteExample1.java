package src;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt", true);//boolean�� true�μ������ָ� ������ش� �⺻�� faulse�� �ʱ�ȭ��Ű�� �����Ѵ�
		Scanner s = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���");
		String ss = s.nextLine();
		char[] data = ss.toCharArray();
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
			// FileWriter�� write�� char[]�� ���� write�޼ҵ� ��ü�� for���� ���־� �ڵ����� �������ش�
		}
		writer.flush();
		writer.close();
	}

}
