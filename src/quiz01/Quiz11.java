package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		//더 큰 수 찾기
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if(a > b && a > c) { //a가 가장 큰 경우
			
			max = a;
			
			if(b > c) { //b가 중간
				mid = b;
				min = c;
			} else {//c가 중간
				mid = c;
				min = b;
			}
		} else if(b > a && b > c) { //b가 가장 큰 경우

			max = b;
			
			if(a > c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}
		} else { //c가 가장 큰 경우
			
			max = c;
			if(a > b) { //a가 중간
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		
		System.out.println(max + " " + mid + " " + min);
	}
}
