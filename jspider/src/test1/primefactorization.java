package test1;

import java.util.Scanner;

public class primefactorization {
	 public static void primeFactors(int n) 
	    { 
	        
	        while (n%2==0) // Print the number of 2s that divide n 
	        { 
	            System.out.print(2 + " "); 
	            n /= 2; 
	        } 
	        for (int i = 3; i <= Math.sqrt(n); i+= 2)  // n must be odd at this point , So we can skip one element (Note i = i +2)
	        { 
	            while (n%i == 0) // While i divides n, print i and divide n 
	            { 
	                System.out.print(i + " "); 
	                n /= i; 
	            } 
	        } 
	        if (n > 2)  // This condition is to handle the case when  n is a prime number greater than 2 
	            System.out.print(n); 
	    } 
	public static void main(String[] args) {
		int n = 200; 
        primeFactors(n); 
	    }
	}

