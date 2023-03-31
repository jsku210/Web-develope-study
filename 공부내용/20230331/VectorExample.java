import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vv = new Vector<String>(); //ArrayList와 마찬가지로 하나의 요소만 넣을수있음
		
		vv.add("안");
		vv.add("녕");
		vv.add("하");
		vv.add("세");
		vv.add("요");
		vv.add("안");
		vv.add("녕");
		vv.add("하");
		vv.add("세");
		vv.add("요");
		vv.add("안");
		vv.add("녕");
		vv.add("하");
		vv.add("세");
		vv.add("요");
		vv.add("안");
		vv.add("녕");
		vv.add("하");
		vv.add("세");
		vv.add("요");
		vv.add("안");
		vv.add("녕");
		vv.add("하");
		vv.add("세");
		vv.add("요");
		vv.setSize(5); // 벡터의 사이즈를 5로설정 아무값도 넣어주지않고 setSize해주면 null이 5개로 잡힌다
		for(String s : vv) {
			System.out.println(s);
		}
		System.out.println(((Vector<String>) vv).capacity());// vv의 용량을 반환
		vv.remove(0);// 0번지의 값을 삭제
		System.out.println(((Vector<String>) vv).capacity());

		((Vector<String>) vv).trimToSize(); //벡터의 크기를 최적화
		System.out.println(((Vector<String>) vv).capacity());
		for(String s : vv) {
			System.out.println(s);
		}
		System.out.println(vv.toString());
		Object[] aa =vv.toArray(); // vv의 요소들을 Object배열에 각각 담아준다
		aa[0]="히";
		for (int i=0; i<aa.length;i++) {
			System.out.println("111"+ aa[i]);
		}
		System.out.println(vv.lastElement());
	}
}
