package src;

import java.util.Scanner;

public class UnknownLengthPattern {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a value for n: ");
		
		int n = input.nextInt();
		
		printMatrix(n);
		
	}
	
	public static void printMatrix(int n) {
		
		System.out.println();
		
		//Rows
		for(int i = 0; i <n; i++) {
			
			//Columns
			for(int j = 0; j < n; j++) {
				
				int binary = (int)(Math.random() * 2);
				
				System.out.print(binary);
			}
			
			System.out.print("|");
			System.out.println();
		}
	}

}
