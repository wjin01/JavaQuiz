package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		//큰 수 찾기
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a == b) {
			System.out.println(0);
		} else if(a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
