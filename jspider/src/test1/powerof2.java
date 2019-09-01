package test1;

import java.util.Scanner;

public class powerof2 {

	public static void main(String[] args) {
		int n; //How many powers of 2 to compute 
		//Exponent for current power of 2 
		int exponent = 1; // 2 ^ 0 = 1 
		final int a = 1; // 2 ^ 1 = 2, etc 
		Scanner scan = new Scanner(System.in); 

		System.out.println("How many powers of 2 would you like printed?"); 
		n = scan.nextInt(); 

		//print a message saying how many powers of 2 will be printed 
		System.out.println ("Alright, here are the first " + n + " powers of 2: "); 

		for (int i=a; i<=n; i++) { 
		//find next power of 2 
		exponent *= 2; 
		//print out current power of 2 
		System.out.println("2 ^ "+i+" = "+exponent); 
		} 

	}

}
