package src;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);//Scanner�� ������ �κ��� ���� InputStream�� ��ü�� ���ԵǴµ� System.in�� �̿� �ش���� �˼��ִ�
//		
//		System.out.print("���ڿ� �Է�> ");
//		String inputString = scanner.nextLine();//Scanner�� nextLine()�� ����� �Է��ϴ��� String�̱⶧���� �Է°���
//		System.out.println(inputString);		
//		System.out.println();
//		
//		System.out.print("���� �Է�> ");
//		int inputInt = scanner.nextInt(); //nextInt()�� int���� �������⶧���� int���� �ٸ����� �Է��ϸ� InputMismatchException ������
//		System.out.println(inputInt);
//		System.out.println();
//		
//		System.out.print("�Ǽ� �Է�> ");
//		double inputDouble = scanner.nextDouble();//��������
//		System.out.println(inputDouble);
		
		Scanner s = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name =s.nextLine();
		System.out.println(name);
	}
}
