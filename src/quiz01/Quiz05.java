package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * quiz02의 문제를 if-else문장으로 변경
		 */
		int r = (int)(Math.random() * 11) -5; // -5 ~ 5
		
		System.out.println("랜덤값 : " + r);
		
		int result; //결과값을 저장할 변수
		
		if(r < 0) {
			result = -r;
		} else {			
			result = r;
		}
		System.out.println("절대값 : " + result);
	}
}
