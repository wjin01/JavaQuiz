package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		
		//백준 2차원배열 - 2566번
		Scanner scan = new Scanner(System.in);
		
		int arr[][] = new int [9][9];
		
		int max = 0;
		int maxi = 1;
		int maxj = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int num = scan.nextInt();
				arr[i][j] = num;
				if(max < arr[i][j]) {
					max = arr[i][j];
					maxi = i+1;
					maxj = j+1;
				}
			}	
		}
		System.out.println(max);
		System.out.println(maxi + " " + maxj);
	}
}
