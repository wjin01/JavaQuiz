package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		/*
		 * 프로그램이 실행되면 랜덤한 덧셈 문제를
		 * 이 랜덤한 수의 범위는 1 ~ 100 사이의 값
		 * 
		 * 사용자가 답안을 입력할 때마다 정답 또는
		 */
		Scanner scan = new Scanner(System.in);
		
		int cnt1 = 0;
		int cnt2 = 0;
		while(true) {
			int ran1 = (int)(Math.random() * 101);
			int ran2 = (int)(Math.random() * 101);
			System.out.println(ran1 + " + " + ran2 + " = ? ");
			
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print("답 : ");
			int zero = scan.nextInt();
			
			int sum = ran1 + ran2;
		
			
			
		   if (zero == 0) {
			System.out.println("프로그램 정상 종료");
			System.out.println("정답 : " + cnt1);
			System.out.println("오답 : " + cnt2);
			break;
		   } else if(zero == sum) {
				System.out.println("정답입니다");
				System.out.println("---------------");
				cnt1++;
		   } else {
			   System.out.println("오답입니다");
			   cnt2++;
		   	}
		}
		
		
	}
}
