package src;

import java.util.Scanner;

public class PentagonalNumber {

	public static void main(String[] args) {
		
		int n;
		int answer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter a value for n :");
		
		n = input.nextInt();
		
		answer = getPentagonalNumber(n);
		
		System.out.println("Youre Pentagonal Number = " +answer);
		
		//100 Master List
		printPentagonalList(args);
		
		input.close();
	}
	
	//Calculates Pentagonal Number
	public static int getPentagonalNumber(int n) {
	
		int answer = ((3*n*n) - (n)) / 2;
		
		return answer;
	}
	
	public static void printPentagonalList(String[] args) {
		
		System.out.println();
		System.out.println();
		System.out.println("|------|------|------|----~Pentagonal Numbers~---|------|------|------|");
		
		for(int i = 1; i < 100 + 1; i++) {
			
			int results;
			
			results = getPentagonalNumber(i);
			
			System.out.print("|");
			System.out.printf("%6d", results);
			
			if(i%10 == 0) {
				
				System.out.print("|");
				System.out.println();
		
			}
		}
		
		System.out.print("|---------------------------------------------------------------------|");
	}
}
