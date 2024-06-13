package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		//메뉴의 가격은 xx원
		Scanner scan = new Scanner(System.in);
		
		String menu = scan.next();
		
		switch (menu) {
		case "수박":
			System.out.println("4만원");
			break;
		case "사과":
			System.out.println("3만원");
			break;
		case "멜론":
			System.out.println("5만원");
			break;
		case "귤":
			System.out.println("6만원");
			break;
		default:
			System.out.println("없는메뉴");
			break;
		}
	}
}
