package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		
		String[] arr = {str, str2, str3};
		
		//arr 상품번호, GS25, (상품명), 가격을 정규표현식으로 나눠서 출력
		
		String pattern1 = "\\d+-\\d+";
		String pattern2 = "GS\\d*";
		String pattern3 = "\\([가-힣]+\\)";
		String pattern4 = "[0-9],[0-9]+원*";
	
		for(int i = 0; i < arr.length; i++) {
			Matcher m = Pattern.compile(pattern1).matcher(arr[i]);
			Matcher m1 = Pattern.compile(pattern2).matcher(arr[i]);
			Matcher m2 = Pattern.compile(pattern3).matcher(arr[i]);
			Matcher m3 = Pattern.compile(pattern4).matcher(arr[i]);
			
			while(m.find() && m1.find() && m2.find() && m3.find()) {
				System.out.println(m.group() + " " + m1.group() + " " + m2.group() + " " + m3.group());
			}
			
		}
		
	}
}
