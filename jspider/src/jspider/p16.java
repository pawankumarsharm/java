package jspider;

import java.util.Scanner;

public class p16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
			
		{
			for(int j=1;j<=i;j++)
			{
				
				if((i+j)%2==0) {
				System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
				
					System.out.print(" ");
			}
			
			System.out.println();
			}
				/*	1
					01
					101
					0101
					10101*/
	}}

