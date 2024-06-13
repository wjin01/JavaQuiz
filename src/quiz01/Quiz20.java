package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		/*
		 * 가로, 세로를 입력받아서 사각형을 출력하니다.
		 * 단, 윤곽만 출력합니다.
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				if(i != 0 && i != b - 1) {
					System.out.print(j != 0 && j != a - 1 ? " " : "*");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

