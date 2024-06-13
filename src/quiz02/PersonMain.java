package quiz02;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, 180);
		p1.info();
		
		Person p2 = new Person();
		p2.info();
	}
}
