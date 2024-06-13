package quiz02;

public class Account {

	String name;
	String password;
	int balance;
	
	Account(String pName, String pPassword, int pBalance) {
		name = pName;
		password = pPassword;
		balance = pBalance;
	}
	//입금
	void deposit(int add) {
		balance += add;
	}
	//출금
	void withDraw(int sub) {
		balance -= sub;
	}
	//잔액조회
	int getbalance() {
		return balance; //클래스 외부에서 값을 가져갈 수 있음
	}
	
}
