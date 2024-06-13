package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		//배수 출력하기
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		int i = 1;
		
		while(i <= x) {
			if(i % n == 0) {
				if(i == x) {	
					System.out.print(i);
				} else {
					System.out.print(i + " ");
				}
			}
			i++;
		}
	}
}
