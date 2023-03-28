package chapter8;

public class Car {
	static Tire[] tire = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire(),
			//객체 다형성
	};
	
	void run(){
		for(int i=0 ; i<tire.length; i++) {
			tire[i].roll(i);
		}
	}
	
	void kuemhoTirechange(int i) {
		tire[i] = new kuemhoTire();
	}
	void hankookTirechange(int i) {
		tire[i] = new HankookTire();

	}

}
