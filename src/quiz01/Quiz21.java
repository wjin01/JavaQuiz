package quiz01;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int x = 4; //소수인지 아닌지 확인
//		
//		int cnt = 0;
//		for(int i = 1; i <= x; i++) {
//			if(x % i == 0) { //i는 약수
//				cnt++;
//			}
//		}
//		System.out.println(cnt == 2 ? "소수" : "소수가 아님");
		
		
		
		//느린 소수의 합
		
		int x = scan.nextInt();
		
		int sum = 0;
		
		start:for(int i = 1; i <= x; i++) {
			int cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
				}
				
				if(cnt > 2) { //더 반복문을 돌릴 필요가 없음
					continue start;
				}
				
			}
			if(cnt == 2) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}
