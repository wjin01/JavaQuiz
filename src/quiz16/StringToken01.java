package quiz16;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
		 * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 분리한 토큰의 개수를 출력
		 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
		 *    1. 안녕
		 *    2. 하세요.
		 *    3. 오늘은 
		 *    4. 날씨가
		 *    5. 좋네요ㅋ
		 * 5. 분리된 문자열을 배열에 저장
		 */
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		StringTokenizer token = new StringTokenizer(str); //공백기준으로 자름
		String[] arr = new String[ token.countTokens() ];
		
		for(int i = 0 ; token.hasMoreTokens() ; i++) {
			
			String word = token.nextToken(); //전진은 한번만
			System.out.println( (i+1) + ". " + word );
			
			arr[i] = word; //배열저장
		}
		
 		
		
		
		
		
		
		
		
		
		
		

	}
}
