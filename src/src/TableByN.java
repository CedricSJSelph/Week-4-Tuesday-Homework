package src;

import java.util.Scanner;

public class TableByN {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a value for n: ");
		
		n = input.nextInt();
		
		displayPattern(n);

	}
	
	public static void displayPattern(int n) {
		
		//Number of lines;
		for(int i = 0; i<=n; i++) {
			
			//Print spaces and number:
			for(int j = n; j>=1; j--) {
				
				System.out.print((i<j) ? " ": j);
			}
			System.out.println();
		}
	}
}
