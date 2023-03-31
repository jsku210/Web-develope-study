import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ArraylistExample {
	public static void main(String[] args) {
//		List<String,Member> arrlist3 = new ArrayList<String,Member>(); //단일객체로는 생성되나 두타입의 으로 넣을때는 오류뜸
		List<String> arrlist1 = new ArrayList<String>();
		Collection<String> arrlist2 = new ArrayList<String>();
		arrlist1.add("나는");
		arrlist1.add("List의 string타입으로 만든 지승민");
		arrlist1.add(2,"이다");
		arrlist2.add("나는");
		arrlist2.add("collection 타입으로만든 지승민");
		arrlist2.add("이다");
//		arrlist1.addAll(arrlist2);
//		arrlist1.forEach(arrlist2); 
		((ArrayList<String>) arrlist1).ensureCapacity(20);//해당객체의 최소갯수를 20으로 정해준다
		if(arrlist1.contains("나는")) {// contains메소드사용하여 해당객체가 있는지 boolean반환
			System.out.println("1. arrlist1에 나는이 있습니다");
		}
		System.out.println("2.indexOf"+arrlist1.indexOf(arrlist2));
		System.out.println("3.indexOf"+arrlist1.indexOf("나는")); // 나는이라는 요소가 처음으로 저장된 번지를 적어준다
		System.out.println("4.indexOf"+arrlist1.lastIndexOf("나는"));//나는이라는 요소가 마지막으로 저장되어있는 번지를 불러온다

		if(arrlist1.isEmpty()==false) {//isEmpty()비어있는지 확인
			System.out.println("5.arrlist1은 비어있지않습니다");
		}else {
			System.out.println("6.arrlist1은 비어있습니다");
		} 
		
		if(arrlist1.isEmpty()==false) {
			System.out.println("7.arrlist1은 비어있지않습니다");
		}else {
			System.out.println("8.arrlist1은 비어있습니다");
		}
//		arrlist1.clear(); // 배열삭제
//		arrlist1.addAll(1, arrlist2);// 1번지부터 arrlist2를 넣어준다
//		arrlist1.sort(null); //string의경우 문자순서대로 정렬된다
		List<String> arrlist3 = arrlist1.subList(1, 3);// 인덱스 1부터 3전인 2까지의 배열읠 해당 리스트에 저장한다
		System.out.println("111 "+arrlist1.size());
		try{
			((ArrayList<String>) arrlist1).trimToSize();
		}
		catch(ConcurrentModificationException e){
			System.out.println("Exception in thread \"main\" java.util.ConcurrentModificationException");
		}
		System.out.println("111 "+arrlist1.size());
		for(int i=0 ; i<arrlist1.size(); i++) {
			System.out.println("9"+arrlist1.get(i));//get메소드를 사용하여 해당번지의 리스트를 꺼내옴
		}
		for(String s : arrlist1) {
			System.out.println("222 "+s);
		}
		for(int i=0 ; i<arrlist2.size(); i++) {
			System.out.println("10"+((ArrayList<String>) arrlist2).get(i));
		}
//		for(int i=0 ; i<arrlist3.size(); i++) {
//			System.out.println("11"+ arrlist3.get(i));
//		}
//		
//		for(String s : arrlist3) {
//			System.out.println("333 "+s);
//		}
//		System.out.println("12"+ arrlist3.toArray());//해당 리스트를 배열로 변환
		
	}
}
