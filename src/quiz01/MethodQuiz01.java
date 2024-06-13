package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		System.out.println("세 매개변수 합: " + method3(1, 2, 4.8));
		System.out.println("짝수? 홀수? : " + method4(5));
		method5(7, "k");
		maxNum(4,7);
		abs(-100);
		
	}
	//세 매개변수 합 리턴
	static double method3(int a, int b, double d) {
		
		return a + b + d;
	}
	
	//매개 변수가 짝수? 홀수? 판별해서 출력
	static String method4(int a) {
		String str = "";
		if(a % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		return str;
	}
	
	//매개변수 int만큼 String 반복 출력
	static void method5(int a, String b) {
		String str = "";
		
		for(int i = 0; i <= a; i++) {
			str += b;
		}
		System.out.println(str);
		return;
	}
	
	//매개변수 2개를 입력받아 큰 수 리턴
	static void maxNum(int a, int b) {
		
		int max = 0;
		if(a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println(max);
		return;
	}
	
	//절대값 리턴
	static void abs(int num) {
		System.out.println(num < 0 ? -num : num);
		return;
	}
}
