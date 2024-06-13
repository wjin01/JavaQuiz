package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] basket = new int[n];
		for(int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}
		
		for(int k = 0; k < m; k++) {
			int i = scan.nextInt() - 1;
			int j = scan.nextInt() - 1;
			
			int temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
			
		}
		System.out.println(Arrays.toString(basket));
		
	}
}
