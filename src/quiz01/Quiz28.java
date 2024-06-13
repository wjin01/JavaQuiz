package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz28 {

	public static void main(String[] args) {
		
		/*
		 * 사용자에게 수정하고 싶은 이름을 입력받는다
		 * 해당 이름이 존재하면 수정할 이름을 새롭게 입력받습니다
		 * 
		 * 만약에 값이 없으면 "이름은 존재하지 않습니다" 를 출력합니다
		 *  
		 * 문자열의 비교
		 * 문자열.equals(비교할문자열)
		 */
		
		
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁"};
		boolean flag = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 이름을 입력하세요 > ");
		String name = scan.next();
	
		for(int i =0; i < arr.length; i++) {
			
			if(name.equals(arr[i])) {//같으면 t, 같지않으면 f
				System.out.println(name + " 이름을 수정합니다");
				System.out.print("> ");
				String editName = scan.next();
				arr[i] = editName; //이름을 변경
				flag = true; //찾은경우려면 true로 변경
				break;				
			}
		}
		//찾았다 못 찾았다
		if(flag) {
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println(name + "는 존재하지 않습니다");	
		}
	}
}
