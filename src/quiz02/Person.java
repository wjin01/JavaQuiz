package quiz02;

public class Person {
	
	String name;
	int age;
	int tall;
	
	//프로그래머가 생성자를 만들면 기본생성자를 자동으로 만들지 않음
	Person() {
		
	}
	
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	Person(String pName, int pAge){
		name = pName;
		age = pAge;
		tall = 170;
	}

	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: " + tall);
		System.out.println("------------------");
	}
	
	
}
