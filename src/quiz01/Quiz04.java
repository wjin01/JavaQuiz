package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/*
		 * 스캐너를 활용해서 이름과 나이를 입력받습니다.
		 * 
		 * 20세 이상이면 성인입니다
		 * 19세 이하라면 미성년자입니다
		 * 를 출력해주세요
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		
		String result = age >= 20 ? "성인" : "미성년자"; 
		System.out.println(result + " 입니다.");
		
		scan.close();
	}
}
