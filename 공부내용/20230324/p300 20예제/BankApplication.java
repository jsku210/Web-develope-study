import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[]args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 ㅣ 2.계좌목록 ㅣ 3.예금 ㅣ 4.출급 ㅣ 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
		
			
			if (selectNo == 1) {
				createAccount();
			}else if ( selectNo ==2) {
				accountList();
			}else if( selectNo ==3) {
				deposit();
			}else if (selectNo ==4) {
				withdraw();
			}else if (selectNo ==5) {
				run = false;
			}

		}
	}


	private static void createAccount() {
		// TODO Auto-generated method stub

		System.out.println("계좌번호를 입력하세요");
		String a= scanner.next();
		System.out.println("이름을 입력하세요");
		String b = scanner.next();
		System.out.println("초기금액을 설정하세요");
		int c = scanner.nextInt();
		
		for(int i=0 ;i<= accountArray.length  ;i++ ) {
			if(accountArray[i]== null) {
				Account aaa = new Account(a,b,c);
				accountArray[i] = aaa;
				accountArray[i].setAno(a);
				accountArray[i].setOwner(b);
				accountArray[i].setBalance(c);
				System.out.println("생성되었습니다");
				break;
			}
		}
	}
	private static void accountList() {
		// TODO Auto-generated method stub
		for(int i=0 ;i<= accountArray.length  ;i++ ) {
			if(accountArray[i]== null) {
				break;
			}else {
				System.out.println(accountArray[i].getAno() + accountArray[i].getOwner()
						+ accountArray[i].getBalance());
			}
		}
		
	}
	
	private static void withdraw() { //출금하기
		// TODO Auto-generated method stub
		System.out.println("출금하실려는 계좌번호를 입력하세요");
		String a = scanner.next();
		System.out.println("출금하실려는 금액을 입력하세요");
		int b = scanner.nextInt();
		findAccount(a).setBalance(findAccount(a).getBalance()-b);;
	}
	private static void deposit() { //예금하기
		// TODO Auto-generated method stub
		System.out.println("예금하실려는 계좌번호를 입력하세요");
		String a = scanner.next();
		System.out.println("예금하실려는 금액을 입력하세요");
		int b = scanner.nextInt();
		Account aab =findAccount(a);
		aab.setBalance(findAccount(a).getBalance()+b);;
		
		
	}
	private static Account findAccount(String ano) {
		Account aabc=null;
		for(int i=0; i<accountArray.length; i++) {
			if(ano == accountArray[i].getAno()) {
				aabc = new Account(accountArray[i].getAno(),
						accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}else {
				continue;
			}
		}return aabc;
		
		

		
	}
}
