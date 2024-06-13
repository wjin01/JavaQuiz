package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		//http://groupsone.site/
		//놀이기구를 타고싶어
		
		Scanner scan = new Scanner(System.in);
		
		double cm = scan.nextDouble();
		int age = scan.nextInt();
		
		if(cm >= 140 && age >= 8) {
			System.out.println("탑승가능");
		} else {
			System.out.println("탑승불가능");
		}
	}
}
