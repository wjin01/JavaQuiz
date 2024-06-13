package quiz01;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		//홀수 짝수 0 찾기
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n == 0) {
			System.out.println("제로");
		} else if(n < 0) {
			System.out.println("음수");
		} else if (n % 2 == 0)  {
			System.out.println("짝수");
		} else{
			System.out.println("홀수");
		} 
	}
}
