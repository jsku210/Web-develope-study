package chapter8;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Car car1;
		kuemhoTire t1 = new kuemhoTire();	
		Tire tire = t1; // 자동타입변환

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("1.현재타이어 목록 2.타이어 교체");
			Car car = new Car();
			int i = sc.nextInt();
//			if (i == 1) {
//				car.run();
//			} else if (i == 2) {
//				System.out.println("1.FL 2.FR 3.BL 4.BR");
//				int a = sc.nextInt();
//				if (a == 1) {
//					car.kuemhoTirechange(0);
//				} else if (a == 2) {
//					car.kuemhoTirechange(1);
//				} else if (a == 3) {
//					car.kuemhoTirechange(2);
//				} else if (a == 4) {
//					car.kuemhoTirechange(3);
//				}
//			} 이렇게 실행하여도 마찬가지로 실행
			switch (i) {
			case 1:
				car.run();
				break;
			case 2:
				System.out.println("1.FL 2.FR 3.BL 4.BR");
				int a = sc.nextInt();
				if (a == 1) {
					car.kuemhoTirechange(0);
					break;
				} else if (a == 2) {
					car.kuemhoTirechange(1);
					break;
				} else if (a == 3) {
					car.kuemhoTirechange(2);
					break;
				} else if (a == 4) {
					car.kuemhoTirechange(3);
					break;
				}

			}
		
		}
	}
}
