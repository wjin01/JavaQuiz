package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		//두 수 사이의 합
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		

		int i = 0;
		int sum = 0;
		
		if(a > b) {
			i = b;
		} else if(b > a) {
			i = a;
			a = b;
		} else {
			i = a + 1;
		}
		while (i <= a) {
			sum += i;
			i++;
		}
		System.out.println("두 수 사이의 합 : " + sum);
		
//		int max = 0;
//		int min = 0;
//		int sum = 0;
//		
//		if(a > b) {
//			max = a;
//			min = b;
//		} else {
//			max = b;
//			min = a;
//		}
//		
//		for(int i = min; i <= max; i++) {
//			sum += i;
//		}
//		
//		System.out.println(max == min ? 0 : sum);
		
	}
}
