package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 배열의 앞에 data를 추가하려고 합니다
		 * 1.새로운 배열 +1 생성합니다
		 * 2.기존배열을 다음 인덱스번째로 옮겨담는다
		 * 3.0번째에 data를 추가
		 */
		
		int[] arr = {10, 20, 30, 40, 50};
		int data = 100;
		
		int[] newArr = new int [arr.length +1];
		
		for(int i =  0; i < arr.length; i++) {
			newArr[i+1] = arr[i];
		}
		
		newArr[0] = data;
		
		arr = newArr;
		
		System.out.println(Arrays.toString(newArr));
		
	}
}
