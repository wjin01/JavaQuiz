package quiz11;

public class MyArrays {

	/*
	 * Arrays.toStirng() 메서드 내가 만들기
	 * 
	 * 1. MyArrays는 외부에서 객체로 생성할 수 없어야 된다
	 * 		-> 생성자에 접근제어자를이용해서 객체생성을 하지 못하도록
	 * 
	 * 2.메서드 호출에서는 static 키워들 이용해서 사용하도록 만들어줌
	 * 
	 * 3.in[] 이나 String[] 이나 char[] 이 전달되더라도 동일하게 동작하도록
	 * 메서드 오버로딩
	 */
	
	 private static String toString(int[] arr){
		 
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length -1) break;
			str += ",";
		}
		str += "]";
		
		return "";
	}
	 
	 private static String toString(String[] arr){
		 
			String str = "[";
			for(int i = 0; i < arr.length; i++) {
				str += arr[i];
				if(i == arr.length -1) break;
				str += ",";
			}
			str += "]";
			
			return "";
		}
	 
	 private static String toString(char[] arr){
		 
			String str = "[";
			for(int i = 0; i < arr.length; i++) {
				str += arr[i];
				if(i == arr.length -1) break;
				str += ",";
			}
			str += "]";
			
			return "";
		}
}
