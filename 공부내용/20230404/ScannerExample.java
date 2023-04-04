package src;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);//Scanner의 생성자 부분을 보면 InputStream의 객체가 들어가게되는데 System.in이 이에 해당됨을 알수있다
//		
//		System.out.print("문자열 입력> ");
//		String inputString = scanner.nextLine();//Scanner의 nextLine()은 어떤값을 입력하더라도 String이기때문에 입력가능
//		System.out.println(inputString);		
//		System.out.println();
//		
//		System.out.print("정수 입력> ");
//		int inputInt = scanner.nextInt(); //nextInt()는 int값만 가져오기때문에 int외의 다른값을 입력하면 InputMismatchException 오류뜸
//		System.out.println(inputInt);
//		System.out.println();
//		
//		System.out.print("실수 입력> ");
//		double inputDouble = scanner.nextDouble();//마찬가지
//		System.out.println(inputDouble);
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name =s.nextLine();
		System.out.println(name);
	}
}
