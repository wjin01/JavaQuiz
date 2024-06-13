package quiz15;

import java.util.Scanner;

public class TryCatch02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int r = (int)(Math.random() * 101);
		System.out.println(r);
		
		int cnt = 0;
		while(true) {
			try {
				System.out.print("1과 100 사이의 값을 입력하세요>");
				int num = scan.nextInt();
				if(r == num) {
					System.out.println("정답입니다");
					break;
				} else if(num > r){
					System.out.println("더 작은수를 입력하세요");
					cnt++;
				} else {
					System.out.println("더 큰수를 입력하세요");
					cnt++;
				}
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다");
				scan.nextLine();
			}
		}
		System.out.println("시도 횟수는: " + cnt);
		
		
	}

}
