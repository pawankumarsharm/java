package jspider;

import java.util.Scanner;

public class pt4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");//2531
		int n=sc.nextInt();
	do {
		int r=n%10;
		
			for(int j=1;j<=r;j++)
			
				System.out.print("* ");
				n=n/10;
			
			System.out.println();
		}
	while(n!=0);

	}
		
	//* 
	//* * * 
	//* * * * * 
	//* * 
}
