package chapter8;

public class HankookTire implements Tire {


	@Override
	public void roll(int i) {
		// TODO Auto-generated method stub
		switch(i) {
		case 0: System.out.println("현재 FL바퀴는 한국타이어입니다");
			break;
		case 1: System.out.println("현재 FR바퀴는 한국타이어입니다");
			break;
		case 2: System.out.println("현재 BL바퀴는 한국타이어입니다");
			break;
		case 3: System.out.println("현재 BR바퀴는 한국타이어입니다");
			break;
		}
		
		
	}

}
