package quiz01;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
		/*
		 * 어떤수 N을 입려갇아서 N까지의 구구단 모형의 출력을 완성
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int N = scan.nextInt();
		int i = 0;
				
		while(i < 9) {
			i++;
			System.out.println(N + " x " + i + " = " + N * i);
		}
	}
}
