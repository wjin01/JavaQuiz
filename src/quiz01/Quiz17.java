package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		//거스름 돈은 어떻게?
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {1000, 500, 100, 50, 10};
		int[] cnt = new int[arr.length];
		
		int x = scan.nextInt();
		int i = 0;
		
		while(i < arr.length) {
			cnt[i] = x / arr[i];
			x %= arr[i];
			System.out.print(arr[i] + " " + cnt[i] + " ");
			i++;
		}
	}
}

