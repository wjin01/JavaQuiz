package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account myAcc= new Account("홍길동", "1234", 3600);
		
		myAcc.deposit(800);
		myAcc.withDraw(1900);
		
		
		int bal = myAcc.getbalance();
		System.out.println(myAcc.name + "님의 남은 계좌 잔액은: " + bal + "원입니다.");
	}
}
