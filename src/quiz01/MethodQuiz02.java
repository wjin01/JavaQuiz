package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1. java()
		 * 매개변수로 정수를 받습니다
		 * 매개변수 1 -> return "자";
		 * 매개변수 2 -> return "자바";
		 * 매개변수 3 -> return "자바자";
		 * 매개변수 4 -> return "자바자바";
		 * 
		 * 2.sum()
		 * 매개변수로 정수를 1개 받습니다
		 * 매개변수의 약수의 합계를 리턴
		 * 매개변수 5 -> return 1 + 5
		 * 매개변수  -> return 1 +2 + 3 + 6
		 * 
		 * 3.primeNum()
		 * 매개변수 2개를 받아서 순서 상관없이 두 수 사이의 합계를 리턴
		 * 1, 2 => return 1 + 2;
		 * 2, 1 => return 1 + 2;
		 * 1, 1 => return 0;;
		 */
		System.out.println(java(4));
		System.out.println(sum(6));
		System.out.println(primeNum(1,2));
		System.out.println(primeNum(1,5));
		System.out.println(primeNum(1,8));
		
	}
	
	//1. java()
	static String java(int a) {
		String str = "";
		for(int i = 1; i <= a; i++) {
			System.out.print(i % 2 != 0 ? "자" : "바");
		}
		return str;
	}
		
	//2.sum()
	static int sum(int b) {
		int sum = 0;
		for(int i = 1; i <= b; i++) {
			if(b % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		return sum;
	}
	
	//3.primeNum()
	static int primeNum(int a, int b) {
		
		if(a == b) return 0;
		
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		
		int sum = 0;
		
//		if(a > b) {
//			max = a;
//			min = b;
//		} else if( a == b){
//			sum = 0;
//		} else {
//			max = b;
//			min = a;
//		}
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
		
	}
}
