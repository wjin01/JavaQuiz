package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			
			String str = scan.next();
			
			arr[i] = str;
		}
	}
}

