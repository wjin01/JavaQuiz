package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		//명인교육의 계산기
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		String n = scan.next();
		int num2 = scan.nextInt();
		
		switch (n) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;

		default:
			System.out.println("잘못입력");
			break;
		}
	}
}
