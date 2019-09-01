package jspider;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
			
		{
			for(int j=1;j<=n;j++)
			{
				if((i+j)>n) {
			
				if((i+j)%2==0) {
				System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				}
				else {
					System.out.print(" ");
				}
				}
			
			System.out.println();
			}
				/*	1
				   10
				  101
				 1010
				10101*/
	}

}
