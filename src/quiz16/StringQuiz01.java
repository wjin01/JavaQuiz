package quiz16;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1.Scanner 를 통해서 공백을 포함한 id 를 입력 받습니다.
		 * 2.공백을 제거한 아이디가 5글자 미만이면 다시 입력 받으세요.
		 * 3.id 는 소문자이어야 합니다.
		 * 
		 * id 가 5글자 이상이면, "아이디가 등록 되었습니다." 를 출력하고 프로그램을 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("사용할 ID를 입력해주세요 : ");
			String id = scan.nextLine();
		
			id = id.replace(" ", "");
			
			if(id.length() >= 5) {
				System.out.println("ID가 등록 되었습니다." + id.toLowerCase());
				break;
			} else {
				System.out.println("ID는 5자 이상입니다.");
			}
		}
			
	}
}
